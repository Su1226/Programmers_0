// 프로그래머스 : 최빈값 구하기

import java.util.HashMap;
import java.util.Map;

public class Mode {
    public int solution(int[] array) {
        int answer = 0;
        int maxCount = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : array) {
            int count = map.getOrDefault(num, 0) + 1;

            if(count > maxCount) {
                maxCount = count;
                answer = num;
            } else if (count == maxCount) {
                answer = -1;
            }

            map.put(num, count);
        }

        return answer;
        }
}

