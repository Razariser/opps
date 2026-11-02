import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min]) min = j;
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println("Before sorting: " + Arrays.toString(a));
        selectionSort(a);
        System.out.println("After sorting : " + Arrays.toString(a));
    }
}
