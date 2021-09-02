import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;


    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        this.todoList.add(task);

    }

    public void print() {
        int i = 0;

        for (String list : todoList) {
            System.out.println((++i) + ": "+ list);
        }
    }

    public void remove(int number) {
        this.todoList.remove(number - 1);
    }
}
