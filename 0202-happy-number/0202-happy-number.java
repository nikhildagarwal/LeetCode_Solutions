class Solution {
    public boolean isHappy(int n) {
        Set<Integer> cycle = new HashSet<>();
        cycle.add(n);
        while(n!=1){
            String num = Integer.toString(n);
                int sum = 0;
            for(int i = 0;i<num.length();i++){
                int temp = (int) num.charAt(i);
                temp = temp-48;
                sum+=temp*temp;
            }
            if(cycle.contains(sum)){
                return false;
            }
            cycle.add(sum);
            n = sum;
        }
        return true;
    }
}