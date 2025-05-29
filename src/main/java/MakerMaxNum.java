// 프로그래머스 : 최댓값 만들기(2)

import java.util.Arrays;

public class MakerMaxNum {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        int positive = numbers[numbers.length - 1] * numbers[numbers.length -2];
        int nagative = numbers[0] * numbers[1];

        if(positive < nagative) answer = nagative;
        else answer = positive;

        return answer;
    }
}
