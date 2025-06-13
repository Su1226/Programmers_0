import java.util.Arrays;

public class NearNumber {
    public int solution(int[] array, int n) {
        int answer = 0;

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if(Math.abs(n - array[0]) > Math.abs(n - array[i])) {
                array[0] = array[i];
            }
        }

        answer = array[0];

        return answer;
    }
}
