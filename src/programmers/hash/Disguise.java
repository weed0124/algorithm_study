package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Disguise {
	public int solution(String[][] clothes) {
		HashMap<String, Integer> clothesMap = new HashMap<String, Integer>();
		// ����� ���� ���ϱ����� 1�� ����
		int answer = 1;
		
		for (String[] cloth : clothes)
		{
			// ������ ���� �ش� ������ ������ �⺻�� 0����
			clothesMap.put(cloth[1], clothesMap.getOrDefault(cloth[1], 0) + 1);
		}
		
		for (Map.Entry<String, Integer> entry : clothesMap.entrySet())
		{
			// ����� �� üũ �� ������ ������ �̹Ƿ� ���� => *= (�� ������ + �� ���� ���)
			answer *= (entry.getValue() + 1);
		}
		
		// �ƹ��͵� ���Դ� ����� �� ����
        return answer - 1;
    }
}
