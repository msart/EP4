public class GeoInto {
     private ST<int, Location> st;
     
     public GeoInto() {
         this.st = new ST<int, Location>;
     }
     
     public GeoInto(int id, Location l) {
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
     
