class Solution {

    public String convert(String s, int numRows) {
        if(numRows ==1){
            return s;
        }else if(numRows>=s.length()){
            return s;
        }else{
            List<Integer> palin = new ArrayList<>();
            int direction = 0;
            int counter = 0;
            for(int i = 0;i<s.length();i++){
                if(direction ==0){
                    palin.add(counter);
                    counter++;
                }else{
                    palin.add(counter);
                    counter--;
                }
                if(counter+1==numRows && direction ==0){
                    direction = 1;
                }
                if(counter==0 && direction ==1){
                    direction = 0;
                }
            }
            List<String> result = new ArrayList<>();
            for(int i = 0;i<numRows;i++){
                result.add("");
            }
            for(int i = 0;i<s.length();i++){
                int temp = palin.get(i);
                result.set(temp,result.get(temp)+s.charAt(i));
            }
            String res = "";
            for(int i = 0;i<numRows;i++){
                res+=result.get(i);
            }
            return res;
        }
        
    }
}