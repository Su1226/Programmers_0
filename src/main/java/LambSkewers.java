// 프로그래머스 : 양꼬치

public class LambSkewers {

    public int solution(int n, int k) {
        int answer = 0;
        int drink = 0;

        drink = n / 10;
        answer = n * 12000 + (k - drink) * 2000;

        return answer;
    }

}
