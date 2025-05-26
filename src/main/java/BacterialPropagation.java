// 프로그래머스 : 세균 증식

public class BacterialPropagation {

    public int solution(int n, int t) {
        int answer = n;

        for (int i = 1; i <= t; i++) {
            answer *= 2;
        }

        return answer;
    }

}
