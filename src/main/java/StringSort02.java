// 프로그래머스 : 문자열 정렬(2)

import java.util.Arrays;

public class StringSort02 {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();

        char[] charArr = my_string.toCharArray();
        Arrays.sort(charArr);

        String answer = new String(charArr);
        return answer;
    }
}
