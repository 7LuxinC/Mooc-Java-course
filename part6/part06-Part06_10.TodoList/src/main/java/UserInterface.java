import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list,Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }

    public void start(){
        while(true){

            System.out.print("Command: ");
            String input = scanner.nextLine();

            if(equalsStop(input)){
                break;
            }else if(input.equals("add")){
               addToList();
            }else if(input.equals("list")){
                list.print();
            }else if(input.equals("remove")){
                removeList();
            }


        }
    }

    public boolean equalsStop(String input){
        if(input.equals("stop")){
            return true;
        }
        return false;
    }

    public void addToList(){
        System.out.print("To add: ");
        String toAdd = scanner.nextLine();

        list.add(toAdd);

    }

    public void removeList(){
        System.out.print("Which one is removed? ");
        int toRemove = Integer.valueOf(scanner.nextLine());

        list.remove(toRemove);
    }



}
