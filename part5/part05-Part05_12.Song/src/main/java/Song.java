
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    //create an equals methods
    public boolean equals(Object compared) {

        //if the variable s are located in the same position, then they are equal
        if (this == compared) {
            return true;
        }

        //if the compared object is not the type Song, the objects are different
        if (!(compared instanceof Song)) {
            return false;
        }

        //convert the object into Song object
        Song compareSong = (Song) compared;

        //if the value of the object variable are equal,the object are equal
        if (this.artist.equals(compareSong.artist) &&
                this.name.equals(compareSong.name) &&
                this.durationInSeconds == compareSong.durationInSeconds) {

            return true;
        }

        //otherwise the objects are not equals
        return false;
    }


    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
