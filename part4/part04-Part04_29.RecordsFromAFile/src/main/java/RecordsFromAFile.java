
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner readFile = new Scanner(Paths.get(file))) {

            while (readFile.hasNextLine()) {
                String input = readFile.nextLine();

                String[] parts = input.split(",");

                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                System.out.println(name + ", ages: " + age + " years");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
