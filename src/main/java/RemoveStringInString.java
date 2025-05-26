// 프로그래머스 : 특정 문자 제거하기

public class RemoveStringInString {

    public String solution(String my_string, String letter) {
        String answer = "";

        answer = my_string.replace(letter, "");

        return answer;
    }
}
