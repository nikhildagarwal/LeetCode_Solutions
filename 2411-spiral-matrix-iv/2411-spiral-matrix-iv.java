/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        
        int[][] res = new int[m][n];
        if(m==1 && n==1){
            res[0][0] = head.val;
            return res;
        }
        if(n==1){
            for(int i = 0;i<m;i++){
                if(head!=null){
                    res[i][0] = head.val;
                    head = head.next;
                }else{
                    res[i][0] = -1;
                }
            }
            return res;
        }
        int totalC = m*n;
        int count = 0;
        int borderUp = 0;
        int borderLeft = 0;
        int borderRight = n-1;
        int borderDown = m-1;
        int direction = 0;
        int row = 0;
        int col =0;
        while(count<totalC){
            switch(direction%4){
                case 0:
                    if(head!=null){
                        res[row][col] = head.val;
                        head = head.next;
                        col++;
                        if(col+1>borderRight){
                            direction++;
                            borderUp++;
                        }
                    }else{
                        res[row][col] = -1;
                        col++;
                        if(col+1>borderRight){
                            direction++;
                            borderUp++;
                        }
                    }   
                break;
                case 1:
                    if(head!=null){
                        res[row][col] = head.val;
                        head = head.next;
                        row++;
                        if(row+1>borderDown){
                            direction++;
                            borderRight--;
                        }
                    }else{
                        res[row][col] = -1;
                        row++;
                        if(row+1>borderDown){
                            direction++;
                            borderRight--;
                        }
                    }  
                break;
                case 2:
                    if(head!=null){
                        res[row][col] = head.val;
                        head = head.next;
                        col--;
                        if(col-1<borderLeft){
                            direction++;
                            borderDown--;
                        }
                    }else{
                        res[row][col] = -1;
                        col--;
                        if(col-1<borderLeft){
                            direction++;
                            borderDown--;
                        }
                    }  
                break;
                case 3:
                    if(head!=null){
                        res[row][col] = head.val;
                        head = head.next;
                        row--;
                        if(row-1<borderUp){
                            direction++;
                            borderLeft++;
                        }
                    }else{
                        res[row][col] = -1;
                        row--;
                        if(row-1<borderUp){
                            direction++;
                            borderLeft++;
                        }
                    }  
                break;
            }
            count++;
        }
        
        return res;
    }
}