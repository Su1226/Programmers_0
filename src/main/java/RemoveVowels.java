// 프로그래머스 : 모음 제거

public class RemoveVowels {

    public String solution(String my_string) {
        String answer = my_string;
        String[] vowels = {"a", "i", "o", "u", "e"};

        for (String str : vowels) {
            answer = answer.replace(str, "");
        }

        return answer;
    }

}
