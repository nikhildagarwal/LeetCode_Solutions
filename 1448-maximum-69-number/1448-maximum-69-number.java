class Solution {
    private static int power10(int a){
        int temp = 1;
        if(a==0){
            return 1;
        }else{
            for(int i = 0;i<a;i++){
                temp = temp*10;
            }
            return temp;
        }        
    }

    public int maximum69Number (int num) {
        int index = -1;
        String number = Integer.toString(num);
        for(int i =0;i<number.length();i++){
            if(number.charAt(i)=='6'){
                index = i;
                i = number.length();
            }
        }
        if(index==-1){
            return num;
        }else{
        int digit = (-1*index)+number.length();
        //System.out.println(digit);
        return num+3*power10(digit-1);
        }
        
    }
}