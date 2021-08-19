
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.valueOf(scanner.nextLine());

        int num2 =Integer.valueOf(scanner.nextLine());

        int sum = num + num2;

        System.out.println((int) Math.sqrt(sum));
    }
}
