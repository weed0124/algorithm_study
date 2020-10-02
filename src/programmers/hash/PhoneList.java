package programmers.hash;

import java.util.Arrays;

/**
 * 전화번호 목록
 * https://programmers.co.kr/learn/courses/30/lessons/42577?language=java
 */
public class PhoneList {
	
	public static void main(String[] args)
	{
		PhoneList item = new PhoneList();
		String[] tmp = 	{"119", "97674223", "1195524421"};
		String[] tmp2 =	{"123", "456", "789"};
		String[] tmp3 =	{"12", "123", "1235", "567", "88"};
		System.out.println("Test Case 1 : " + item.solution(tmp));
		System.out.println("Test Case 2 : " + item.solution(tmp2));
		System.out.println("Test Case 3 : " + item.solution(tmp3));
	}
	
	public boolean solution(String[] phone_book)
	{
		boolean result = true;
		Arrays.sort(phone_book);
		
		for (int i = 0; i < phone_book.length - 1; i++)
		{
			if (phone_book[i + 1].indexOf(phone_book[i]) == 0)
			{
				result = false;
			}
		}
		
		return result;
	}
}
