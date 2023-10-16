class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if(n==0){
            return new int[] {-1,-1};
        }
        int[] res = new int[] {-1,-1};
        int mid= n/2;
        if(nums[mid]==target){
            int signal = 0;
            for(int i =mid;i>=0;i--){
                if(nums[i]!=target){
                    res[0] = i+1;
                    signal = 1;
                }
                if(nums[i]==target && i==0){
                    res[0] = i;
                }
                if(signal ==1){
                    i = -1;
                }
            }
            signal = 0;
            for(int i = mid;i<n;i++){
                if(nums[i]!=target){
                    res[1] = i-1;
                    signal = 1;
                }
                if(nums[i]==target && i==n-1){
                    res[1] = n-1;
                }
                if(signal ==1){
                    i = n;
                }
            }
        }else if(nums[mid]<target){
            int start = 0;
            for(int i = mid;i<n;i++){
                if(nums[i]==target){
                    res[0] = i;
                    start = i;
                    i = n;
                }
            }
            int signal = 0;
            for(int i=start;i<n;i++){
                if(nums[i]!=target){
                    res[1] = i-1;
                    signal = 1;
                }
                if(nums[i]==target && i==n-1){
                    res[1] = n-1;
                }
                if(signal == 1){
                    i = n;
                }
            }
        }else if(nums[mid]>target){
            int start = 0;
            for(int i = mid;i>=0;i--){
                if(nums[i]==target){
                    res[1] = i;
                    start = i;
                    i = -1;
                }
            }
            int signal = 0;
            for(int i = start;i>=0;i--){
                if(nums[i]!=target && res[1]!=-1){
                    res[0] = i+1;
                    signal = 1;
                }
                if(nums[i]==target && i==0){
                    res[0] = 0;
                }
                if(signal ==1){
                    i=-1;
                }
            }
        }
        return res;
    }
}