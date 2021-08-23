import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them


        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true){
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if(title.isEmpty()){
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int years =Integer.valueOf(scanner.nextLine());

            books.add(new Book(title,pages,years));
        }

        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();

        if (input.equals("everything")){
            for (Book allBooks:  books) {
                System.out.println(allBooks.toString());
            }
        }


        if (input.equals("name")){
            for (Book allBooks:  books) {
                System.out.println(allBooks.getTitle());
            }
        }

    }
        }
