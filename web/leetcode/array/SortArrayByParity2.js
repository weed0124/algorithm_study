/**
 * LeetCode 922. Sort Array By Parity II.
 * 
 * @param {number[]} A
 * @return {number[]}
 */
var sortArrayByParityII = function(A) {
    var result = [];
    var evenIdx = 0; // 짝수 인덱스
    var oddIdx = 1; // 홀수 인덱스
    // 주어진 배열의 길이만큼 각 수가 홀수/짝수인지 체크하여 순서에 맞게 배열에 넣어준다.
    for (var i = 0; i < A.length; i++) {
        if (A[i] % 2 === 0) {
            result[evenIdx] = A[i];
            evenIdx += 2;
        } else {
            result[oddIdx] = A[i];
            oddIdx += 2;
        }
    }
    return result;
};