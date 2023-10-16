/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while(low<=high){
            int x = low+ (high-low)/2;
            int signal = guess(x);
            if(signal==0){
                return x;
            }else if(signal == -1){
                high = x-1;
            }else{
                low = x+1;
            }
        }
        return -1;
    }
}