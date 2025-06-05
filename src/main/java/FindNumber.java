public class FindNumber {
    public int solution(int num, int k) {
        String answer = String.valueOf(num);

        for (int i = 0; i < answer.length(); i++) {
            if(answer.charAt(i) - '0' == k) return i + 1;
        }

        return -1;
    }
}
