public class GenericFunctions {
    public static void main(String[] args) {
        Integer[] i = {1, 2, 3};
        String[] s = {"a", "b", "c"};
        print(i);
        print(s);
    }
    static <T> void print(T[] a) {
        for (T x : a) System.out.print(x + " ");
        System.out.println();
    }
}
