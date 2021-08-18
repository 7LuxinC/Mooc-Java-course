
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int valueOfGift = Integer.valueOf(scan.nextLine());

        double tax = (100 + (valueOfGift - 5000)* 0.08);
        double tax1 = (1700 + (valueOfGift - 25000)* 0.10);
        double tax2 = (4700 + (valueOfGift - 55000)* 0.12);
        double tax3 = (22100 + (valueOfGift - 200000)* 0.15);
        double tax4 = (142100 + (valueOfGift - 1000000)* 0.17);

        if(valueOfGift < 5000){
            System.out.println("No tax!");
        }else if(valueOfGift >= 5000 && valueOfGift < 25000 ){
            System.out.println("Tax: " + tax);
        }else if(valueOfGift >= 25000 && valueOfGift < 55000){
            System.out.println("Tax: " + tax1);
        }else if(valueOfGift >= 55000 && valueOfGift < 200000){
            System.out.println("Tax: " + tax2);
        }else if(valueOfGift >= 200000 && valueOfGift < 1000000){
            System.out.println("Tax: " + tax3);
        }else {
            System.out.println("Tax: " + tax4);
        }

    }
}
