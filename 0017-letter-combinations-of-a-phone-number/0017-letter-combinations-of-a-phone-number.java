class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        HashMap<Character,String> data = new HashMap<>();
            data.put('2',"abc");
            data.put('3',"def");
            data.put('4',"ghi");
            data.put('5',"jkl");
            data.put('6',"mno");
            data.put('7',"pqrs");
            data.put('8',"tuv");
            data.put('9',"wxyz");
        if(digits == ""){
            return result;
        }else if(digits.length()==1){
            String temp = data.get(digits.charAt(0));
            for(int i=0;i<temp.length();i++){
                String ye = "" + temp.charAt(i);
                result.add(ye);
            }
            return result;
        }else if(digits.length()==2){
            String temp0 = data.get(digits.charAt(0));
            String temp1 = data.get(digits.charAt(1));
            for(int i= 0;i<temp0.length();i++){
                for(int j=0;j<temp1.length();j++){
                    String ye = "" + temp0.charAt(i)+temp1.charAt(j);
                    result.add(ye);
                }
            }
            return result;
        }else if(digits.length()==3){
            String temp0 = data.get(digits.charAt(0));
            String temp1 = data.get(digits.charAt(1));
            String temp2 = data.get(digits.charAt(2));
            for(int i= 0;i<temp0.length();i++){
                for(int j=0;j<temp1.length();j++){
                    for(int k=0;k<temp2.length();k++){
                        String ye = "" + temp0.charAt(i)+temp1.charAt(j)+temp2.charAt(k);
                        result.add(ye);
                    }
                    
                }
            }
            return result;
        }else if(digits.length()==4){
            String temp0 = data.get(digits.charAt(0));
            String temp1 = data.get(digits.charAt(1));
            String temp2 = data.get(digits.charAt(2));
            String temp3 = data.get(digits.charAt(3));
            for(int i= 0;i<temp0.length();i++){
                for(int j=0;j<temp1.length();j++){
                    for(int k=0;k<temp2.length();k++){
                        for(int l = 0;l<temp3.length();l++){
                            String ye = "" + temp0.charAt(i)+temp1.charAt(j)+temp2.charAt(k)+temp3.charAt(l);
                        result.add(ye);
                        }
                        
                    }
                    
                }
            }
            return result;

            
        }
        return result;
    }
}