
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
    
    public boolean interval(Location loc1, Location loc2) {
        if (latitude >= loc1.latitude() && latitude <= loc2.latitude() && longitude >= loc1.longitude() && longitude <= loc2.longitude()) return true;
        return false;
    }
   
    // calculo da distÃ¢ncia, aproximando a regiÃ£o por um plano (em kilometros);
    public double distance(Location that){
        return (Math.sqrt(Math.pow((this.latitude - that.latitude), 2) + Math.pow((this.longitude - that.longitude), 2)))*1852*0.06;
    }

    public String toString() {
        return ("latitude: " + this.latitude + " longitude: " +  this.longitude);
    }

}
