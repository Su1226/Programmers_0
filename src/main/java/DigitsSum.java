// 프로그래머스 : 자릿수 더하기

public class DigitsSum {

    public int solution(int n) {
        int answer = 0;

        String str = Integer.toString(n);
        String[] strings = str.split("");

        for (int i = 0; i < strings.length; i++) {
            answer += Integer.parseInt(strings[i]);
        }


        return answer;
    }

}
