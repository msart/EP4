
public class Location {
    private final long latitude;
    private final long longitude;

    public Location(long latitude, long longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long latitude() { return latitude; }
    public long longitude() { return longitude; }

    public boolean equals(Location that) {
        if      (that.latitude() == this.latitude() && that.longitude() == this.longitude()) return true;
        else return false;
    }

    public String toString() {
        return ("latitude: " + this.latitude + " longitude: " +  this.longitude);
    }

}
