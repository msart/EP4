
public class Location {
    private final double latitude;
    private final double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double latitude() { return latitude; }
    public double longitude() { return longitude; }

    public boolean equals(Location that) {
        if      (that.latitude() == this.latitude() && that.longitude() == this.longitude()) return true;
        else return false;
    }
    
    public double distance(Location that){
        double theta = this.longitude() - that.longitude();
        double dist = Math.sin(deg2rad(this.longitude())) * Math.sin(deg2rad(that.longitude())) + Math.cos(deg2rad(this.longitude())) * Math.cos(deg2rad(that.longitude())) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        dist = dist * 1.609344; // ta em kilmetros, achei na net esse metodo
         return (dist);
    }

    public String toString() {
        return ("latitude: " + this.latitude + " longitude: " +  this.longitude);
    }

}
