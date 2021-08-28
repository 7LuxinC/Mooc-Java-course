
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter value = new Counter(5);

        value.increase();
        value.decrease();
        value.increase(5);
        value.decrease(5);
        System.out.println(value.value());
    }
}
