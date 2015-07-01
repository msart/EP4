public class SymbolGeoEWDigraph {
    private SymbolEWDigraph sewd;
    private GeoInfo gi;
    
    public SymbolGeoEWDigraph(String fileXML, String fileAdjList) {
        gi = new GeoInfo(fileXML);
        sewd = new SymbolEWDigraph(fileAdjList, " ", gi);
    }
    
    public SymbolEWDigraph map() {
        return sewd;
    }
    
    public GeoInfo locations() {
        return gi;
    }
}
        
