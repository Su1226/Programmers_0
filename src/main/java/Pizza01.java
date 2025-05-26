// 프로그래머스 : 피자 나눠 먹기(3)

public class Pizza01 {
    public int solution(int n) {
        int answer = 0;

        if(n % 7 == 0) {
             answer = n / 7;
        } else {
            answer = n / 7 + 1;
        }

        return answer;
    }
}
