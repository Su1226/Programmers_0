// 프로르머스 : 암호 해독

class Decryption {
    public String solution(String cipher, int code) {
        String answer = "";

        for (int i = code - 1; i < cipher.length(); i += code) {
            answer += cipher.charAt(i);
        }

        return answer;
    }
}
