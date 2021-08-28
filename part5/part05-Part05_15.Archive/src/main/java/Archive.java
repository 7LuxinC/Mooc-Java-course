public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object compared) {
        //if the variables are in the position,they are equal;
        if (this == compared) {
            return true;
        }

        //if the compared object is not the Type Archive ,then they are different
        if (!(compared instanceof Archive)) {
            return false;
        }

        //convert Object into Archive Type
        Archive comparedArchive = (Archive) compared;

        if (this.identifier.equals(comparedArchive.identifier)) {
            return true;
        }

        //otherwise return false
        return false;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
