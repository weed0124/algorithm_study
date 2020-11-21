package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 118. Pascal's Triangle
 * https://leetcode.com/problems/pascals-triangle/
 */
public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> array = new ArrayList<List<Integer>>();
        
        // 0�� ������ ����
        if (numRows == 0)
        {
            return array;
        }
        
        // ù��°�� ������ 1
        array.add(new ArrayList<>());
        array.get(0).add(1);
        
        for (int i = 1; i < numRows; i++)
        {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = array.get(i - 1);
            
            // ���� row �� ù��°�� ������ 1
            row.add(1);
            
            for (int j = 1; j < i; j++)
            {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            // ���� row �� �������� ������ 1
            row.add(1);
            array.add(row);
        }
        return array;
    }
}
