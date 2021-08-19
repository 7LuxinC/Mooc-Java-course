
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = Integer.valueOf(scanner.nextLine());

        integer = integer * integer;
        System.out.println(integer);
    }
}
