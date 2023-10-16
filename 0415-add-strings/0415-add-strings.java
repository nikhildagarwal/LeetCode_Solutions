class Solution {
    public String addStrings(String num1, String num2) {
        if(num1.equals("0")){
            return num2;
        }else if(num2.equals("0")){
            return num1;
        }else{
            if(num1.length()==num2.length()){

            }else if(num1.length()>num2.length()){
                while(num2.length()!=num1.length()){
                    num2 = "0"+num2;
                }
            }else{
                while(num1.length()!=num2.length()){
                num1 = "0"+num1;
                }
            }
            int length = num1.length();
            String result = "";
            List<Integer> carryOver = new ArrayList<>();
            int counter = 0;
            for(int i = length-1;i>=0;i--){
                if(i==length-1){
                    int first = (int)num1.charAt(length-1)-48;
                    int second = (int)num2.charAt(length-1)-48;
                    int ye = first+second;
                    
                    int carry = (ye-(ye%10))/10;
                    carryOver.add(carry);
                    result = Integer.toString((ye%10));
                    
                }else{
                    int first = (int)num1.charAt(i)-48;
                    
                    int second = (int)num2.charAt(i)-48;
  
                    int ye = first+second+carryOver.get(counter);

                    counter++;
                    int carry = (ye-(ye%10))/10;
                    carryOver.add(carry);
                    result = Integer.toString((ye%10))+result;
                }
            }
            if(carryOver.get(counter)>0){
                result = Integer.toString(carryOver.get(counter)) + result;
            }
            return result;
        }
    }
}