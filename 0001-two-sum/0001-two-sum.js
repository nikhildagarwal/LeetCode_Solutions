/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let length = nums.length;
    const ans = [];
    for(let i = 0;i<length;i++){
        for(let j = i+1;j<length;j++){
            if(nums[i]+nums[j]==target){
                ans[0] = i;
                ans[1] = j;
            }
        }
    }
    return ans;
};