class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        int wL = words.length;
        int dist1 = -1;
        int dist2 = -1;
        int signal1 = -1;
        int signal2 = -1;
        for(int i = 0;i<=wL/2;i++){
            int currIndexR = (startIndex+i)%wL;
            int currIndexL = (startIndex-i+wL)%wL;
            if(words[currIndexR].equals(target) && signal1<0){
                dist1 = i;
                signal1 = 1;
            }
            if(words[currIndexL].equals(target) && signal2<0){
                dist2 = i;
                signal2 = 1;
            }
        }
        if(dist1==-1 && dist2==-1){
            return -1;
        }else if(dist1==-1){
            return dist2;
        }else if(dist2 ==-1){
            return dist1;
        }else{
            return Math.min(dist1,dist2);
        }
    }
}