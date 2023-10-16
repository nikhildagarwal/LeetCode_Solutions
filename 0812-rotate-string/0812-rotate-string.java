class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        StringBuilder hi = new StringBuilder();
        hi.append(s);
        hi.append(s);
        return hi.toString().contains(goal);
    }
}