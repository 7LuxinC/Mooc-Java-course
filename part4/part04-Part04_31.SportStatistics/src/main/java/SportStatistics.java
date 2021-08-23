
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();

        System.out.println("Team: ");
        String team = scan.nextLine();

        int counter = 0;
        int win = 0;
        int losses = 0;

        try (Scanner readFile = new Scanner(Paths.get(file))) {

            while (readFile.hasNextLine()) {
                String games = readFile.nextLine();

                String[] parts = games.split(",");
                String name = parts[0];
                String name1 = parts[1];
                int score = Integer.valueOf(parts[2]);
                int score1 = Integer.valueOf(parts[3]);

                if (name.equals(team) && score > score1) {
                    counter++;
                    win++;
                } else if (name1.equals(team) && score1 > score) {
                    counter++;
                    win++;
                } else if (name.equals(team) && score < score1){
                    counter++;
                    losses++;
                }else if((name1.equals(team) && score1 < score)){
                    counter++;
                    losses++;
                }



            }
            System.out.println("Games: " + counter);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + losses);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
