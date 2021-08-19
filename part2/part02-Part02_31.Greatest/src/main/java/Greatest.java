
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here

        int tempNum = 0;

        if (number1 < number2) {
            tempNum = number2;
            if (tempNum < number3) {
                tempNum = number3;
            }
        } else if (number1 < number3) {
            tempNum = number3;
            if (tempNum < number2) {
                tempNum = number2;
            }
        } else {
            tempNum = number1;
        }


        return tempNum;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
