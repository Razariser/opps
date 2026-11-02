import java.util.Scanner;

public class LinearSearch {
    static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == key) return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int pos = linearSearch(a, key);
        if (pos >= 0) System.out.println(key + " found at position " + (pos + 1));
        else System.out.println(key + " not found");
    }
}
