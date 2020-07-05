/**
 * LeetCode 1237. Find Positive Integer Solution for a Given Equation
 * 
 * // This is the CustomFunction's API interface.
 * // You should not implement it, or speculate about its implementation
 * function CustomFunction() {
 *
 *     @param {integer, integer} x, y
 *     @return {integer}
 *     this.f = function(x, y) {
 *         ...
 *     };
 *
 * };
 */
/**
 * @param {CustomFunction} f
 * @param {integer} z
 * @return {integer[][]}
 */
var findSolution = function(f, z) {
    var result = [];
    // 주어진 조건만큼 이중반복문으로 체크
    for (var x = 1; x <= 1000; x++) {
        for (var y = 1; y <= 1000; y++) {
            // function (x, y) === z 이면 결과값 추가
            if (f.f (x, y) === z) {
                result.push([x, y]);
                break;
            }
        }
    }
    return result;
};