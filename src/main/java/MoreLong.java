// 프로그래머스 : 머쓱이보다 키 큰 사람

import java.util.Arrays;

public class MoreLong {

    public int solution(int[] array, int height) {
        int answer = 0;

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if(array[i] > height) answer++;
        }

        return answer;
    }


}
