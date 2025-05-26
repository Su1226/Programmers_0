// 프로그래머스 : 뒤집힌 문자열

public class ReversString {

    public String solution(String my_string) {
        String answer = "";

        for(int i = my_string.length() - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }

        return answer;
    }

}
