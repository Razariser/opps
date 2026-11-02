import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] a, int key) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) return mid;
            else if (a[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int pos = binarySearch(a, key);
        if (pos >= 0) System.out.println(key + " found at position " + (pos + 1));
        else System.out.println(key + " not found");
    }
}
