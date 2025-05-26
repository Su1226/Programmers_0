// 프로그래머스 : n의 배수 구하기

public class NDrainage {

    public int[] solution(int n, int[] numlist) {

        int len = 0;

        for (int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                len++;
            }
        }

        int[] answer = new int[len];
        int index = 0;

        for (int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer[index] = numlist[i];
                index++;
            }
        }

        return answer;
    }

}
