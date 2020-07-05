/**
 * LeetCode 1051. Height Checker
 * 
 * @param {number[]} heights
 * @return {number}
 */
var heightChecker = function(heights) {
    var count = 0;
    // 레퍼런스 참조없이 복사(Deep Copy)
    var sortedHeights = heights.slice();
    // 배열 정렬
    sortedHeights = sortedHeights.sort(function(a, b) {
        return a - b;
    });
    
    for (var i = 0; i < heights.length; i++) {
        if (heights[i] !== sortedHeights[i]) {
            count++;
        }
    }
    return count;
};