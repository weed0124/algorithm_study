/**
 * LeetCode 852. Peak Index In a Mountain Array
 * 
 * @param {number[]} A
 * @return {number}
 */
var peakIndexInMountainArray = function(A) {
    var i = 0;
    while(A[i] < A[i + 1]) {
        i++;
    }
    return i;
};