import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> packages;

    public Package() {
        this.packages = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.packages.add(gift);
    }

    public int totalWeight() {
        if (this.packages.isEmpty()) {
            return -1;
        }

        int sumOfPac = 0;

        for (Gift kg : this.packages) {
            sumOfPac += kg.getWeight();
        }

        return sumOfPac;
    }
}
