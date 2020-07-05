/**
 * LeetCode 977. Squares of a Sorted Array
 * 
 * @param {number[]} A
 * @return {number[]}
 */
var sortedSquares = function(A) {
    var result = [];
    A.map(function(num) {
       result.push(Math.abs(num * num)); 
    });
    return result.sort(function(a, b) {
        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else if (a == b) {
            return 0;
        }
    });
};