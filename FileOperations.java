import java.io.*;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        Scanner sc = new Scanner(System.in);

        try {
            // Create and write
            System.out.print("Enter text to write to file: ");
            String text = sc.nextLine();
            FileWriter fw = new FileWriter(fileName);
            fw.write(text + "\n");
            fw.close();
            System.out.println("File written successfully");

            // Append
            System.out.print("Enter text to append: ");
            String more = sc.nextLine();
            FileWriter fa = new FileWriter(fileName, true);
            fa.write(more + "\n");
            fa.close();
            System.out.println("Text appended successfully");

            // Read
            System.out.println("\nFile contents:");
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
            br.close();

            // File info
            File f = new File(fileName);
            System.out.println("\nFile name : " + f.getName());
            System.out.println("Path      : " + f.getAbsolutePath());
            System.out.println("Size      : " + f.length() + " bytes");
            System.out.println("Readable  : " + f.canRead());
            System.out.println("Writable  : " + f.canWrite());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
