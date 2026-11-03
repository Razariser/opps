class Stack {
    int[] a = new int[5];
    int top = -1;
    void push(int x) {
        if (top == 4) System.out.println("Overflow");
        else a[++top] = x;
    }
    void pop() {
        if (top == -1) System.out.println("Underflow");
        else System.out.println("Popped " + a[top--]);
    }
    void show() {
        for (int i = top; i >= 0; i--) System.out.print(a[i] + " ");
        System.out.println();
    }
}
public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10); s.push(20); s.push(30);
        s.show();
        s.pop();
        s.show();
    }
}
