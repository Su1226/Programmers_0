// 프로그래머스 : 모스부호 (1) Day9

import java.util.HashMap;
import java.util.Map;

public class MorseCode01 {
    public String solution(String letter) {
        String answer = "";

        HashMap<String, String> morseCode = new HashMap<>();
        morseCode.put(".-", "a");
        morseCode.put("-...", "b");
        morseCode.put("-.-.", "c");
        morseCode.put("-..", "d");
        morseCode.put(".", "e");
        morseCode.put("..-.", "f");
        morseCode.put("--.", "g");
        morseCode.put("....", "h");
        morseCode.put("..", "i");
        morseCode.put(".---", "j");
        morseCode.put("-.-", "k");
        morseCode.put(".-..", "l");
        morseCode.put("--", "m");
        morseCode.put("-.", "n");
        morseCode.put("---", "o");
        morseCode.put(".--.", "p");
        morseCode.put("--.-", "q");
        morseCode.put(".-.", "r");
        morseCode.put("...", "s");
        morseCode.put("-", "t");
        morseCode.put("..-", "u");
        morseCode.put("...-", "v");
        morseCode.put(".--", "w");
        morseCode.put("-..-", "x");
        morseCode.put("-.--", "y");
        morseCode.put("--..", "z");

        String[] morse = letter.split(" ");

        for (String str : morse) {
            answer += morseCode.get(str);
        }

        return answer;
    }
}
