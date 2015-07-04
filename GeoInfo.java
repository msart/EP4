public class GeoInfo {
     private ST<String, Location> st;
     
     public GeoInfo(String filename, SymbolEWDigraph map) {
         this.st = new ST<String, Location>();
         In in = new In(filename);

         while (in.hasNextLine()) {
             String line = in.readLine();
             if (line.startsWith(" <node")) {
                 String[] lineSplit = line.split("\"");
                 if (map.contains(lineSplit[1]))
                         st.put(lineSplit[1], new Location(Double.parseDouble(lineSplit[15]), Double.parseDouble(lineSplit[17])));
             }
         }
     }

     public Location get(String id) {
         return(st.get(id));         
     }
     
     public Iterable<String> nodes() {
         return st.keys();
     }
} 
