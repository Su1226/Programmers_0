// 프로그래머스 : 369게임

public class Game369 {
    public int solution(int order) {
        int answer = 0;

        String number = String.valueOf(order);
        String[] numArr = number.split("");

        for(int i = 0; i < numArr.length; i++) {
            if (numArr[i].equals("3") || numArr[i].equals("6") || numArr[i].equals("9")) {
                answer++;
            }
        }

        return answer;
    }
}
