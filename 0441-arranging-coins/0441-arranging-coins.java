class Solution {
    public int arrangeCoins(int n) {
        int counter = 0;
        int iterator = 1;
        while(n-iterator>=0){
            n = n-iterator;
            counter++;
            iterator++;
        }
        return counter;
    }
}