public class GeoInfo {
     private ST<Double, Location> st;
     
     public GeoInfo(String filename) {
         this.st = new ST<Double, Location>();
         In in = new In(filename);

         while (in.hasNextLine()) {
             String line = in.readLine();
             if (line.startsWith(" <node")) {
                 String[] lineSplit = line.split("\"");
                 st.put(Double.parseDouble(lineSplit[1]), new Location(Double.parseDouble(lineSplit[15]), Double.parseDouble(lineSplit[17])));
             }
         }
     }
     
     public void put(double id, Location l) {
         st.put(id, l);
     }
     
     public Location get(double id) {
         return(st.get(id));         
     }
     
     public Iterable<Double> nodes() {
         return st.keys();
     }
} 
