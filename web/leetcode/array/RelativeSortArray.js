/**
 * LeetCode 1122. Relative Sort Array
 * 
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @return {number[]}
 */
var relativeSortArray = function(arr1, arr2) {
    var sortedArr = [];
    // 전개연산자(...)를 통해 deep copy해준다.
    var copyArr = [...arr1];
    for (var i = 0; i < arr2.length; i++) {
        // 중복되는 값을 filter 메소드로 구분한다.
        var duplicate = copyArr.filter(function(num) {
           return num === arr2[i]; 
        });
        // 중복되지 않은 유니크한 값만을 모아서 새로 구성한다.
        copyArr = copyArr.filter(function(num) {
           return num !== arr2[i]; 
        });
        // 중복되는 값을 우선적으로 배열에 넣어준다.
        sortedArr.push(...duplicate);
    }
    // 전개연산자를 통해 해당 값만을 추출해내어 sort메소드로 정렬시켜 배열에 넣어준다.
    sortedArr.push(...copyArr.sort(function(a, b) {
        return a - b;
    }));
    return sortedArr;
};