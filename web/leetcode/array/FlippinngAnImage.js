/**
 * https://leetcode.com/problems/flipping-an-image/
 * @param {number[][]} A
 * @return {number[][]}
 */
var flipAndInvertImage = function(A) {
     return A.map(function(a) {
          return a.reverse().map(function(n) {
               return n === 0 ? 1 : 0; 
          });
     });
};