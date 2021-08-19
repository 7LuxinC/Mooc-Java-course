
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            } else {
                input = input + 1;
                sum = sum + num;
            }


        }
        double average = (double)sum / input;
        System.out.println("Average of the numbers: " + average);

    }
}
