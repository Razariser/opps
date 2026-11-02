import java.util.Scanner;

class Stack {
    private int[] arr;
    private int top;

    Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top == arr.length - 1) System.out.println("Stack Overflow");
        else {
            arr[++top] = x;
            System.out.println(x + " pushed");
        }
    }

    void pop() {
        if (top == -1) System.out.println("Stack Underflow");
        else System.out.println(arr[top--] + " popped");
    }

    void display() {
        if (top == -1) System.out.println("Stack is empty");
        else {
            System.out.print("Stack (top to bottom): ");
            for (int i = top; i >= 0; i--) System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        Stack s = new Stack(sc.nextInt());
        int ch;
        do {
            System.out.println("\n1.Push 2.Pop 3.Display 4.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    s.push(sc.nextInt());
                    break;
                case 2: s.pop(); break;
                case 3: s.display(); break;
                case 4: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice");
            }
        } while (ch != 4);
    }
}
