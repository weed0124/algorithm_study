/**
 * LeetCode 961. N-Repeated Element in Size 2N Array
 * 
 * @param {number[]} A
 * @return {number}
 */
var repeatedNTimes = function(A) {
     return A.filter(function(n, i) {
          return A.indexOf(n) != i ;
     })[0];
};