// 프로그래머스 : 피자 나눠 먹기(3)

public class Pizza03 {
    public int solution(int slice, int n) {
        int answer = 0;

        if (n % slice == 0) {
            answer = n / slice;
        } else {
            answer = n / slice + 1;
        }

        return answer;
    }
}
