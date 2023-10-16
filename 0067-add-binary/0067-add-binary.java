class Solution {
    public String addBinary(String a, String b) {
        List<Integer> build = new ArrayList<>();
        int la = a.length();
        int lb = b.length();
        if(la<lb){
            while(a.length()<b.length()){
                a = "0"+a;
            }
        }else if(la>lb){
            while(a.length()>b.length()){
                b = "0"+b;
            }
        }
        for(int i = a.length()-1;i>=0;i--){
            int temp1 = (int) a.charAt(i);
            int temp2 = (int) b.charAt(i);
            temp1-=48;
            temp2-=48;
            build.add(temp1+temp2);

        }
        
        for(int i = 0;i<build.size()-1;i++){
            int temp = build.get(i);
            if(temp==2){
                build.set(i,0);
                int newN = build.get(i+1) +1;
                build.set(i+1,newN);
            }
            if(temp==3){
                build.set(i,1);
                int newN = build.get(i+1) +1;
                build.set(i+1,newN);
            }
        }
        int hi = build.get(build.size()-1);
        if(hi==2){
            build.set(build.size()-1,0);
            build.add(1);
        }
        if(hi==3){
            build.set(build.size()-1,1);
            build.add(1);
        }
        String result = "";
        for(int i = build.size()-1;i>=0;i--){
            String temp = Integer.toString(build.get(i));
            result+=temp;
        }
        return result;
    }
}