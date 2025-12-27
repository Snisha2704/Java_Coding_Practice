import java.util.Scanner;

public class PrintUntilCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char c = sc.next().charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                break;
            }
            System.out.print(s.charAt(i));
        }
        sc.close();
    }
}
