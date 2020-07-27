package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 412. Fizz Buzz
 * https://leetcode.com/problems/fizz-buzz/
 */
public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for (int num = 1; num <= n; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                result.add("FizzBuzz");
            } else if (num % 3 == 0) {
                result.add("Fizz");
            } else if (num % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add("" + num);
            }
        }
        
        return result;
    }
}
