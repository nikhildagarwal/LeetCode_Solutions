class Solution {
    private static String parse(String a){
        String result = "";
        char temp = a.charAt(0);
        int counter = 0;
        int Leng = a.length();
        for(int i = 0;i<Leng;i++){
            char curr = a.charAt(i);
            if(curr == temp){
                counter++;
            }else{
                result+=Integer.toString(counter)+temp;
                temp = a.charAt(i);
                counter = 1;
            }
        }
        result+=Integer.toString(counter)+temp;
        return result;
    }

    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        return parse(countAndSay(n-1));
    }
}