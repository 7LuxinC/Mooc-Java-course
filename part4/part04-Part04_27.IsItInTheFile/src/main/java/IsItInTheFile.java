
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner readFile = new Scanner(Paths.get(file))) {
            String temp = "Not found.";

            while (readFile.hasNextLine()) {
                String row = readFile.nextLine();

                if (row.equals(searchedFor)) {
                    temp = "Found!";
                }
            }
            System.out.println(temp);

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
