// 프로그래머스 : 최댓값 만들기(1)

public class MaxNumber01 {

    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] * numbers[j] > max) max = numbers[i] * numbers[j];
            }
        }

        answer = max;

        return answer;
    }
}
