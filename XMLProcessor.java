public class XMLProcessor {
    public static String extractReferencePoints(String filename) {
        String newfile = filename.replaceAll(".osm", "-extracted.osm"); 
        Out out = new Out(newfile);
        In in = new In(filename);
        
        String line = "";
        while (in.hasNextLine()) {
            line = in.readLine();
            if (line.startsWith(" <bounds")) break;
        }
        String[] lineSplit = line.split("\"");
        out.println(lineSplit[1] + " " + lineSplit[3] + " " + lineSplit[5] + " " + lineSplit[7]);
        
        while (in.hasNextLine()) {
            line = in.readLine();
            if (line.startsWith(" <node")) {
                lineSplit = line.split("\"");
                out.println(lineSplit[1] + " " + lineSplit[15] + " " + lineSplit[17]);
            }
        }
        return newfile;
    }
    
    public static void main(String[] args) {
        StdOut.println(XMLProcessor.extractReferencePoints(args[0]));
    }
}
