// 프로그래머스 : 문자 반복 출력하기

public class CharRepeatPrint {

    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        for (int i = 0; i < my_string.length(); i++) {
            answer += str[i].repeat(n);
        }

        return answer;
    }
}
