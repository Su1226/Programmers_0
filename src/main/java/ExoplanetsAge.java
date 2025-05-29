public class ExoplanetsAge {
    public String solution(int age) {
        String answer = "";
        String planet962 = "abcdefghij";
        String[] ageArr = String.valueOf(age).split("");

        for (int i = 0; i < ageArr.length; i++) {
            answer += planet962.charAt(Integer.valueOf(ageArr[i]));
        }

        return answer;
    }
}
