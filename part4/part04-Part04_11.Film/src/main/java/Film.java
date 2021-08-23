public class Film {
    private String name;
    private int ageRating;

    public Film(String fileName, int filmAgeRating) {
        this.name = fileName;
        this.ageRating = filmAgeRating;
    }

    public String name() {
        return this.name;
    }

    public int ageRating() {
        return this.ageRating;
    }
}
