// 프로그래머스 : 아이스 아메리카노

public class IceImericano {

    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffee = money / 5500;
        int hayMoney = money % 5500;

        answer[0] = coffee;
        answer[1] = hayMoney;

        return answer;
    }

}
