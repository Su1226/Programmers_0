// 프로그래머스 : 소인수분해

import java.util.ArrayList;

public class PrimeFactorization {
    public int[] solution(int n) {
        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                numList.add(i);
            }
        }

        int[] answer = new int[numList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numList.get(i);
        }
        return answer;
    }
}
