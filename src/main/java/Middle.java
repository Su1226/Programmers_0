// 프로그래머스 : 중앙값 구하기

import java.util.Arrays;

public class Middle {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);

        if(array.length % 2 == 0) {
            answer = array[array.length / 2] + array[array.length / 2 - 1] / 2;
        } else {
            answer = array[array.length / 2];
        }

        return answer;
    }
}
