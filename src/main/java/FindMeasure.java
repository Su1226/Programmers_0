import java.util.Arrays;

public class FindMeasure {
    public int[] solution(int n) {
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) index++;
        }

        int[] answer = new int[index];
        int resultIndex = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer[resultIndex] = i;
                resultIndex++;
            }
        }

        Arrays.sort(answer);

        return answer;
    }
}
