import java.util.*;
public class LinearSearch {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int[] x = {10, 20, 30, 40, 50};
        System.out.print("Enter key: ");
        int k = s.nextInt(), p = -1;
        for (int i = 0; i < x.length; i++)
            if (x[i] == k) { p = i; break; }
        System.out.println(p >= 0 ? "Found at " + (p + 1) : "Not found");
    }
}
