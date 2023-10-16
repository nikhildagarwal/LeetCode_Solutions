class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int curr = tasks[0];
        int len = tasks.length;
        int taskCount = 0;
        int ans = 0;
        for(int i =0;i<len;i++){
            if(tasks[i]!=curr){
                if(taskCount==1){
                    return -1;
                }else if(taskCount==2){
                    ans++;
                }else{
                    int div = taskCount/3;
                    int rem = taskCount%3;
                    ans+=div;
                    if(rem>0){
                        ans++;
                    }
                }
                taskCount=1;
                curr = tasks[i];
            }else{
                taskCount++;
            }
        }
        if(taskCount==1){
                    return -1;
                }else if(taskCount==2){
                    ans++;
                }else{
                    int div = taskCount/3;
                    int rem = taskCount%3;
                    ans+=div;
                    if(rem>0){
                        ans++;
                    }
                }
        return ans;
    }
}