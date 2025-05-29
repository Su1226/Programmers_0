import java.util.Scanner;

public class UpperLowerLetterChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] chars = a.toCharArray();

        for(char c : chars) {
            if(Character.isUpperCase(c)) c = Character.toLowerCase(c);
            else c = Character.toUpperCase(c);
        }

        a = String.valueOf(chars);
    }
}
