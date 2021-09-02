import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> luggage;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.luggage = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int suitcaseWeight = this.totalKg() + suitcase.totalWeight();

        if (suitcaseWeight <= this.maxWeight) {
            this.luggage.add(suitcase);
        }
    }

    public int totalKg() {
        int suitcaseWeight = 0;
        for (Suitcase suitcase : this.luggage) {
            suitcaseWeight += suitcase.totalWeight();
        }
        return suitcaseWeight;
    }

    public String toString() {
        return this.luggage.size() + " suitcases (" + this.totalKg() + " kg)";
    }

    public void printItems() {

        for (Suitcase items : this.luggage) {
            items.printItems();
        }
    }

}
