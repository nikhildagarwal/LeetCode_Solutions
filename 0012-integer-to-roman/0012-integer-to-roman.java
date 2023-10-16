class Solution {
    private static int getDigit(int b,int a){
        return (b%power10(a)-b%power10(a-1))/power10(a-1);
    }

    private static int power10(int b){
        int temp = 1;
        if(b==0){
            return 1;
        }else{
            for(int i =0;i<b;i++){
                temp = temp*10;
            }
            return temp;
        }
        
    }

    public String intToRoman(int num) {
        String number = Integer.toString(num);
        List<String> digit1 = new ArrayList<>();
        digit1.add("I");
        digit1.add("II");
        digit1.add("III");
        digit1.add("IV");
        digit1.add("V");
        digit1.add("VI");
        digit1.add("VII");
        digit1.add("VIII");
        digit1.add("IX");
        List<String> digit2 = new ArrayList<>();
        digit2.add("X");
        digit2.add("XX");
        digit2.add("XXX");
        digit2.add("XL");
        digit2.add("L");
        digit2.add("LX");
        digit2.add("LXX");
        digit2.add("LXXX");
        digit2.add("XC");
        List<String> digit3 = new ArrayList<>();
        digit3.add("C");
        digit3.add("CC");
        digit3.add("CCC");
        digit3.add("CD");
        digit3.add("D");
        digit3.add("DC");
        digit3.add("DCC");
        digit3.add("DCCC");
        digit3.add("CM");
        List<String> digit4 = new ArrayList<>();
        digit4.add("M");
        digit4.add("MM");
        digit4.add("MMM");
        int count = 0;
        //Stack<String> build = new Stack<>();
        String result = "";
        for(int i=0;i<number.length();i++){
            int temp = getDigit(num,i+1);
            if(temp==0){
                count++;
            }else{
                if(i==0){
                result = digit1.get(temp-1) +result;
                //System.out.println(digit1.get(temp-1));
            }else if(i==1){
                result = digit2.get(temp-1) +result;
                //System.out.println(digit2.get(temp-1));
            }else if(i==2){
                result = digit3.get(temp-1) +result;
                //System.out.println(digit3.get(temp-1));
            }else if(i==3){
                result = digit4.get(temp-1) +result;
                //System.out.println(digit4.get(temp-1));
            }
            }
            
        }
        
        
        return result;
    }
}