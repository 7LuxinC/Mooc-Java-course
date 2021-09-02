import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (alreadyEntered(input)) {
                break;
            } else if (input.equals("add")) {
                addWord();
            } else if (input.equals("search")) {
                searchWord();
            } else {

                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
    }

    //to check if the input have these words:
    public boolean alreadyEntered(String input) {
        if (input.equals("end")) {
            return true;
        }

        return false;
    }


    //add word to dictionary:
    public void addWord() {
        System.out.print("Word: ");
        String word = scanner.nextLine();

        System.out.print("Translation: ");
        String translate = scanner.nextLine();

        this.dictionary.add(word, translate);
    }


    public void searchWord() {

        System.out.print("To be translated: ");
        String word1 = scanner.nextLine();

        if (this.dictionary.translate(word1) == null) {
            System.out.println("Word " + word1 + " was not found");

        } else {
            System.out.print("Translation: ");
            System.out.println(this.dictionary.translate(word1));
        }


    }
}