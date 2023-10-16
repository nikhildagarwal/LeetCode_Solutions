/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    let set = new Set();
    let l = nums.length;
    for(let i = 0;i<l;i++){
        let n = nums[i];
        if(set.has(n)){
            return true;
        }else{
            set.add(n);
        }
    }
    return false;
};