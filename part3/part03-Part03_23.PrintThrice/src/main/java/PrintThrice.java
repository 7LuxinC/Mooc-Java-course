
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word: ");
        String input = scanner.nextLine();

        String input3 = input + input + input;
        System.out.println(input3);
    }
}
