// 프로그래머스 : 삼각형의 완성조건(1)

import java.util.Arrays;

public class TriangleCondition01 {

    public int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);

        if(sides[2] < sides[1] + sides[0]) answer = 1;
        else answer = 2;

        return answer;
    }

}
