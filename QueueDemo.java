class Queue {
    int[] a = new int[5];
    int f = 0, r = -1;
    void add(int x) {
        if (r == 4) System.out.println("Full");
        else a[++r] = x;
    }
    void remove() {
        if (f > r) System.out.println("Empty");
        else System.out.println("Removed " + a[f++]);
    }
    void show() {
        for (int i = f; i <= r; i++) System.out.print(a[i] + " ");
        System.out.println();
    }
}
public class QueueDemo {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10); q.add(20); q.add(30);
        q.show();
        q.remove();
        q.show();
    }
}
