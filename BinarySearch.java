import java.util.*;
public class BinarySearch {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int[] x = {10, 20, 30, 40, 50};
        System.out.print("Enter key: ");
        int k = s.nextInt(), lo = 0, hi = x.length - 1, p = -1;
        while (lo <= hi) {
            int m = (lo + hi) / 2;
            if (x[m] == k) { p = m; break; }
            else if (x[m] < k) lo = m + 1;
            else hi = m - 1;
        }
        System.out.println(p >= 0 ? "Found at " + (p + 1) : "Not found");
    }
}
