
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one =0;
        while(true){


            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if(num == 0){
                break;
            }else{
                one = one + 1;
            }



        }
        System.out.println("Number of numbers: " + one);
    }
}
