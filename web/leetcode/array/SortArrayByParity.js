/**
 * LeetCode 905. Sort Array By Parity.
 * @param {number[]} A
 * @return {number[]}
 */
var sortArrayByParity = function(A) {
	var evenNum = [], oddNum = [];
	A.map(function(a) {
		if (a % 2 == 0) {
			evenNum.push(a);
		} else {
			oddNum.push(a);
		}
	});
	return evenNum.concat(oddNum);
};