/**
 * 	LeetCode 561. Array Partition I
 * 
 * @param {number[]} nums
 * @return {number}
 */
var arrayPairSum = function(nums) {
    var sorted = nums.sort(function(a, b) { return a - b; });
    var result = 0;
    for (var i = 0; i < sorted.length; i+=2) {
        result += sorted[i];
    }
    return result;
};