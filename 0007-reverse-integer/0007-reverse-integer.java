class Solution {
    public int reverse(int x) {
        boolean neg = false;
        if(x<0){
            neg = true;
            x = Math.abs(x);
        }
        int sign = 0;
        String num = Integer.toString(x);
        Stack<Character> digit = new Stack<>();
        for(int i =0;i<num.length();i++){
            //System.out.println(num.charAt(i));
            if(num.charAt(i) == '-'){
                sign++;
            }else{
                            digit.push(num.charAt(i));

            }
        }
        String build = "";
        for(int i =0;i<num.length()-sign;i++){
            //System.out.println(num.charAt(i));
            build = build+digit.pop();
        }
        //System.out.println(build);
        long newNum = Long.parseLong(build);
        int ye = 0;
        if(newNum>Integer.MAX_VALUE){
            return 0;
        }else{
            ye = (int) newNum;
        }
        //System.out.println(newNum);
        if(neg==true){
            return ye *-1;
        }else{
            return ye;
        }
    }
}