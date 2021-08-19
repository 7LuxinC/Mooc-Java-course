
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int input = 0;

        while(true) {
            int num = Integer.valueOf(scanner.nextLine());

            if(num == 0) {
                break;
            }

            if (num > 0) {
                input = input + 1;
                sum = sum + num;
            }


        }

        if(sum > 0) {
            double average = (double)sum / input;
            System.out.println(average);
        }else{
            System.out.print("Cannot calculate the average");
        }

    }
}
