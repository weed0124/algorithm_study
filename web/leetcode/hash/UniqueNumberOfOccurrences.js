/**
 * LeetCode 1207. Unique Number of Occurrences
 * 
 * @param {number[]} arr
 * @return {boolean}
 */
var uniqueOccurrences = function(arr) {
    var obj = new Object();
    arr.map(function(num) {
        if (obj.hasOwnProperty(num)) {
            obj[num]++;
        } else {
            obj[num] = 1;
        }
    });
    var count = Object.values(obj);
    return count.every(function(c) {
       return count.indexOf(c) === count.lastIndexOf(c); 
    });
};