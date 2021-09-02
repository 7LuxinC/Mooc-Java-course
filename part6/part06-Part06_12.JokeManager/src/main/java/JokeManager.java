import java.util.ArrayList;
import java.util.Random;

public class JokeManager{
        private ArrayList<String> manager;

    public JokeManager(){
        this.manager = new ArrayList<>();
    }

    public void addJoke(String joke){
        this.manager.add(joke);
    }

    public String drawJoke(){
        if(this.manager.isEmpty()){
            return "Jokes are in short supply.";
        }

        Random draw = new Random();
        int index = draw.nextInt(this.manager.size());

        return this.manager.get(index);
    }

    public void printJokes(){

        for(String joke : this.manager){
            System.out.println(joke);
        }

    }
}
