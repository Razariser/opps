public class GenericFunctions {

    // Generic method to print any type of array
    static <T> void printArray(T[] arr) {
        for (T x : arr) System.out.print(x + " ");
        System.out.println();
    }

    // Generic method to find the largest element
    static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];
        for (T x : arr)
            if (x.compareTo(max) > 0) max = x;
        return max;
    }

    // Generic method to swap two elements of an array
    static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] ints = {10, 45, 23, 67, 5};
        Double[] doubles = {1.5, 9.2, 3.7};
        String[] strs = {"apple", "mango", "banana"};

        System.out.print("Integer array : "); printArray(ints);
        System.out.println("Max           : " + findMax(ints));

        System.out.print("\nDouble array  : "); printArray(doubles);
        System.out.println("Max           : " + findMax(doubles));

        System.out.print("\nString array  : "); printArray(strs);
        System.out.println("Max           : " + findMax(strs));

        swap(ints, 0, 4);
        System.out.print("\nIntegers after swapping first and last: ");
        printArray(ints);
    }
}
