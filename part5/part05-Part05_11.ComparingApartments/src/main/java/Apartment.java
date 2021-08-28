
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares < compared.squares) {
            return false;
        }
        return true;
    }

    public int priceDifference(Apartment compared) {
        int price = this.squares * this.princePerSquare;
        int priceCompared = compared.squares * compared.princePerSquare;

        int difference = price - priceCompared;
        if (difference < 0) {
            difference *= -1;
            return difference;
        }
        return difference;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }

        return false;
    }
}
