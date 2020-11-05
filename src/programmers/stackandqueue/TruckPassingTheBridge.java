package programmers.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 다리를 지나는 트럭
 * https://programmers.co.kr/learn/courses/30/lessons/42583
 */
public class TruckPassingTheBridge {
	
	public static void main(String[] args)
	{
		TruckPassingTheBridge t = new TruckPassingTheBridge();
		
		int[] truck1 = {7, 4, 5, 6};
		int[] truck2 = {10};
		int[] truck3 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		
		System.out.println("Test Case1 : " + t.solution(2, 10, truck1));
		System.out.println("Test Case2 : " + t.solution(100, 100, truck2));
		System.out.println("Test Case3 : " + t.solution(100, 100, truck3));
	}
	
	public int solution(int bridge_length, int weight, int[] truck_weights)
	{
        int currentTime = 0;
        int accrossingTruckWeights = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int truck : truck_weights)
        {
        	while (true)
        	{
	            if (q.isEmpty())
	            {
	                q.offer(truck);
	                accrossingTruckWeights += truck;
	                currentTime++;
	                break;
	            }
	            else if (q.size() == bridge_length)
	            {
	            	accrossingTruckWeights -= q.poll();
	            }
	            else
	            {
	                if (accrossingTruckWeights + truck > weight)
	                {
	                    currentTime++;
	                    q.offer(0);
	                }
	                else
	                {
	                    q.offer(truck);
	                    accrossingTruckWeights += truck;
	                    currentTime++;
	                    break;
	                }
	            }
        	}
        }
        return currentTime + bridge_length;
    }
}
