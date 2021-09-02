import java.util.ArrayList;

public class Stack{
    private ArrayList<String> stacks;

    public Stack(){
        this.stacks = new ArrayList<>();
    }

    public boolean isEmpty(){
        if(this.stacks.isEmpty()){
            return true;
        }
        return false;
    }

    public void add(String value){
        this.stacks.add(value);
    }

    public ArrayList<String> values(){
      return this.stacks;
    }

    public String take(){
        String lastStack = this.stacks.get(this.stacks.size() - 1);
        this.stacks.remove(lastStack);
        return lastStack;
    }

}