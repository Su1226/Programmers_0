// 프로그래머스 : 피자 나눠 먹기(3)

public class Pizza02 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            if(n * i % 6 == 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
