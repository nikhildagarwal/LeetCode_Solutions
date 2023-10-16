class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();
        if(length1>length2) return false;
        char[] word1Array = s1.toCharArray();
        Arrays.sort(word1Array);
        for(int i = 0;i<length2-length1+1;i++){
            String tempS = s2.substring(i,i+length1);
            char[] subArray = tempS.toCharArray();
            Arrays.sort(subArray);
            if(Arrays.equals(word1Array,subArray)) return true;
        }

        return false;
    }
}