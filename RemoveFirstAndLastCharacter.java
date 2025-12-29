import java.util.Scanner;

public class RemoveFirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.print(s.substring(1, s.length() - 1));
        sc.close();
    }
}
