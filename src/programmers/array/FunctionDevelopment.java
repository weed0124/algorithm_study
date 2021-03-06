package programmers.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 기능개발 
 * 해당 문제의 의도는 스택 또는 큐를 사용하는 것이었지만 배열에 넣고 해결하였으므로 array에 분류 처리
 * 추후 스택 또는 큐를 구현하여 처리 해 볼 것 
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 */
public class FunctionDevelopment {
	public int[] solution(int[] progresses, int[] speeds) {
		List<Integer> workDayList = new ArrayList<Integer>();
		calculateWorkDay(workDayList, progresses, speeds);
		return this.getDeployDayCount(workDayList);
	}

	// 해당 배포일 배포개수
	private int[] getDeployDayCount(List<Integer> workDayList) {
		List<Integer> answer = new ArrayList<Integer>();
		for (int index = 0; index < workDayList.size(); index++) {
			int deployDayCount = 1;
			int saveIndex = index;

			for (int subIndex = index + 1; subIndex < workDayList.size(); subIndex++) {
				// 작업이 끝났어도 이전 작업이 완료 상태가 아니면 배포 불가
				// 다음 작업이 현재 작업보다 크지 않은경우만 한번의 배포일로 묶어 처리
				if (workDayList.get(index) < workDayList.get(subIndex)) {
					break;
				} else {
					saveIndex++;
					deployDayCount++;
				}
			}
			answer.add(deployDayCount);
			index = saveIndex;
		}

		return answer.stream().mapToInt(Integer::intValue).toArray();
	}

	// 작업소요일 계산
	private List<Integer> calculateWorkDay(List<Integer> workDayList, int[] progresses, int[] speeds) {
		for (int index = 0; index < progresses.length; index++) {
			int endDay = (100 - progresses[index]) % speeds[index] == 0 ? (100 - progresses[index]) / speeds[index]
					: (100 - progresses[index]) / speeds[index] + 1;

			workDayList.add(endDay);
		}
		return workDayList;
	}
}
