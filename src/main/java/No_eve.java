// 프로그래머스 : 짝수는 싫어요.

public class No_eve {
    public int[] solution(int n) {
        int[] answer;

        if (n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[(n + 1) / 2];
        }

        for (int i = 1; i <= n; i+=2) {
            answer[i / 2] = i;
        }

        return answer;
    }
}
