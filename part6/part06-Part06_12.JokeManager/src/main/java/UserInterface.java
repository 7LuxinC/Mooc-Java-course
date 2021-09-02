import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokeManager;

    public UserInterface( JokeManager jokeManager, Scanner scanner) {
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    }

    public void start() {
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");

            String in = scanner.nextLine();

            if (in.equals("X")) {
                break;
            } else if (in.equals("1")) {
                addJokeInManager();
            } else if (in.equals("2")) {
                System.out.println(this.jokeManager.drawJoke());
            } else if (in.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokeManager.printJokes();
            }
        }
    }


    public void addJokeInManager() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();

        this.jokeManager.addJoke(joke);
    }


    }


