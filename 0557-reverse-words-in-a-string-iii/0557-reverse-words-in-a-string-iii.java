class Solution {
    public String reverseWords(String s) {
        char[] data = s.toCharArray();
        int counter = data.length-1;
    int length = data.length;
            
            for(int i = 0;i<length/2;i++){
                char temp = data[i];
                data[i] = data[counter];
                data[counter] = temp;
                counter--;
            }
            String result = "";
            for(int i = 0;i<length;i++){
                result = result+data[i];
            }
            Stack<String> build = new Stack<>();
            int temp = 0;
            for(int i = 0;i<length;i++){
                if(result.charAt(i)==' ' || i == length-1){
                    if(i==length-1){
                        build.push(result.substring(temp));
                    }else{
                        build.push(result.substring(temp,i));
                    build.push(" ");
                    temp = i+1;
                    }
                    
                }
            }
            String fi = "";
            while(!build.empty()){
                fi = fi+build.pop();
            }
            return fi;
    }
}