class Solution {
    public int addDigits(int num) {
        String number = Integer.toString(num);
        while (number.length()>1){
            int sum = 0;
            for(int i = 0;i<number.length();i++){
                int temp = (int) number.charAt(i);
                temp -= 48;
                sum+=temp;
            }
            number = Integer.toString(sum);
        }

        return Integer.parseInt(number);
    }
}