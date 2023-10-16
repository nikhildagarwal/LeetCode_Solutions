class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> data = new Stack<>();
        int len = tokens.length;
        for(int i =0;i<len;i++){
            String temp = tokens[i];
            if(temp.equals("-")){
                int rs2 = Integer.parseInt(data.pop());
                int rs1 = Integer.parseInt(data.pop());
                rs1-=rs2;
                data.push(Integer.toString(rs1));
            }else if(temp.equals("+")){
                int rs2 = Integer.parseInt(data.pop());
                int rs1 = Integer.parseInt(data.pop());
                rs1+=rs2;
                data.push(Integer.toString(rs1));
            }else if(temp.equals("/")){
                int rs2 = Integer.parseInt(data.pop());
                int rs1 = Integer.parseInt(data.pop());
                rs1/=rs2;
                data.push(Integer.toString(rs1));
            }else if(temp.equals("*")){
                int rs2 = Integer.parseInt(data.pop());
                int rs1 = Integer.parseInt(data.pop());
                rs1*=rs2;
                data.push(Integer.toString(rs1));
            }else{
                data.push(temp);
            }
        }
        return Integer.parseInt(data.pop());
    }
}