import java.util.ArrayList;

public class Room {
    private ArrayList<Person> rooms;

    public Room() {
        this.rooms = new ArrayList<>();
    }

    public void add(Person person) {
        this.rooms.add(person);
    }

    public boolean isEmpty() {
        if (this.rooms.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.rooms;
    }

    public Person shortest() {
        if (this.rooms.isEmpty()) {
            return null;
        }

        Person shortest = this.rooms.get(0);

        for (Person per : rooms) {

            if (per.getHeight() <= shortest.getHeight()) {
                shortest = per;
            }

        }
        return shortest;
    }

    public Person take() {

        if (this.rooms.isEmpty()) {
            return null;
        }

        Person shortPer = shortest();

        this.rooms.remove(shortPer);

        return shortPer;


    }


}