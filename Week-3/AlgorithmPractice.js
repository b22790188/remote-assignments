function twoSum(nums, target) {
    /**
     * use table to store {value, index} pair, when target - nums[i] in table,
     * extract index from object and return it with current value index.
     */
    let table = {};
    for (let i = 0; i < nums.length; i++) {

        if (table.hasOwnProperty(target-nums[i])) {
            return [table[target - nums[i]], i]
        } else {
            table[nums[i]] = i
        }
    }
    return [-1];
}

console.log(twoSum([2,7,11,15], 9));
/*
For example:
    twoSum([2, 7, 11, 15], 9);
Should returns:
    [0, 1]
Because:
    nums[0]+nums[1] is 9
*/