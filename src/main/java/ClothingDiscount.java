// 프로그래머스 : 옷가게 할인 받기

public class ClothingDiscount {

    public int solution(int price) {
        double tmp = 0;

        if(price >= 500000) {
            tmp = price - (price * 0.8);
        } else if (price >= 300000) {
            tmp = price - (price * 0.9);
        } else if (price >= 100000) {
            tmp = price - (price * 0.95);
        } else {
            tmp = price;
        }

        int answer = (int) tmp;

        return answer;
    }

}
