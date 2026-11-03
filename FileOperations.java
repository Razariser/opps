import java.io.*;
public class FileOperations {
    public static void main(String[] args) throws IOException {
        FileWriter w = new FileWriter("a.txt");
        w.write("Hello Java\n");
        w.close();
        BufferedReader r = new BufferedReader(new FileReader("a.txt"));
        String l;
        while ((l = r.readLine()) != null) System.out.println(l);
        r.close();
    }
}
