class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> data = new ArrayList<>();
        for(int i = 0;i<digits.length;i++){
            data.add(digits[i]);
        }
        data.set(data.size()-1,data.get(data.size()-1)+1);
        for(int i = data.size()-1;i>0;i--){
            int temp = data.get(i);
            if(temp>9){
                data.set(i,0);
                data.set(i-1,data.get(i-1)+1);
            }
        }
        int hi = data.get(0);
        if(hi>9){
            data.set(0,0);
            data.add(0,1);
        }

        int[] result = new int[data.size()];
        for(int i = 0;i<data.size();i++){
            result[i] = data.get(i);
        }

        
        return result;
    }
}