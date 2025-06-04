public class CharacterCoordinate {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = board[0] / 2;
        int y = board[1] / 2;

        for(String key : keyinput) {
            if (key.equals("left") && answer[0] > -x) answer[0]--;
            else if (key.equals("right") && answer[0] < x) answer[0]++;
            else if (key.equals("up") && answer[1] < y) answer[1]++;
            else if (key.equals("down") && answer[1] > -y) answer[1]--;
        }

        return answer;
    }
}
