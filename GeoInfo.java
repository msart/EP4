public class GeoInfo {
     private ST<int, Location> st;
     
     public GeoInfo() {
         this.st = new ST<int, Location>;
     }
     
     public GeoInfo(int id, Location l) {
         this.st = new ST<int, Location>;
         st.put(id, l);
     }
     
     public put(int id, Location l) {
         st.put(id, l);
     }
     
     public get(int id) {
         st.get(id);
     }
}

//talvez precise adicionar mais coisas
     
