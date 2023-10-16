class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        if(num2.length() < num1.length()){
            String temp = num2;
            num2 = num1;
            num1 = temp;
        }
        char[] bottom = num1.toCharArray();
        char[] top = num2.toCharArray();

        int curr1 = Character.getNumericValue(bottom[bottom.length-1]);
        int carry = 0;
        List<Integer> first = new ArrayList<>();
        for(int j = top.length-1;j>=0;j--){
            int curr2 = Character.getNumericValue(top[j]);
            int num = (curr2*curr1 + carry);
            first.add(0,num%10);
            carry = num/10;
        }
        first.add(0,carry);
        int lvl = 1;
        for(int i = bottom.length-2;i>=0;i--){
            int t1 = Character.getNumericValue(bottom[i]);
            int c = 0;
            List<Integer> temp = new ArrayList<>();
            for(int j = top.length-1;j>=0;j--){
                int t2 = Character.getNumericValue(top[j]);
                int num = (t1*t2 + c);
                temp.add(0,num%10);
                c = num/10;
            }
            temp.add(0,c);
            for(int k=0;k<lvl;k++){
                temp.add(0);
            }
            lvl++;
            int C = 0;
            for(int k = first.size()-1;k>=0;k--){
                int hope = first.get(k)+temp.remove(temp.size()-1)+C;
                first.set(k,hope%10);
                C = hope/10;
            }
            while(temp.size()>0){
                int funch = temp.remove(temp.size()-1)+C;
                first.add(0,funch%10);
                C = funch/10;
            }
            if(C>0) first.add(0,C);
        }
        int start = 0;
        while(first.get(start)==0){
            start++;
        }
        String ans = "";
        for(int i = start;i<first.size();i++){
            ans+=Integer.toString(first.get(i));
        }
        return ans;
    }
}