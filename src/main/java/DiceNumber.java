// 프로그래머스 : 주사위의 개수

public class DiceNumber {
    public int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}
