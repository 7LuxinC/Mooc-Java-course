import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    private int totalKg;


    public Suitcase(int maxKg) {
        this.maxWeight = maxKg;
        this.items = new ArrayList<>();
        this.totalKg = 0;

    }

    public void addItem(Item item) {
        int total = totalKg + item.getWeight();

        if (total <= this.maxWeight) {
            this.items.add(item);
            this.totalKg = total;

        }

    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return this.totalKg;
    }

    public Item heaviestItem() {

        if(this.items.isEmpty()){
            return null;
        }
       Item heaviestItems = this.items.get(0);

        for (Item heaviest : this.items) {
            if (heaviest.getWeight() >= heaviestItems.getWeight()) {
                heaviestItems = heaviest;
            }
        }
        return heaviestItems;
    }


    public String toString() {

        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item (" + this.totalKg + " kg)";
        }


        return this.items.size() + " items (" + this.totalKg + " kg)";
    }

}
