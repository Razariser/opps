import java.util.Scanner;

class Queue {
    private int[] arr;
    private int front, rear, count;

    Queue(int size) {
        arr = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    void enqueue(int x) {
        if (count == arr.length) System.out.println("Queue is full");
        else {
            rear = (rear + 1) % arr.length;
            arr[rear] = x;
            count++;
            System.out.println(x + " enqueued");
        }
    }

    void dequeue() {
        if (count == 0) System.out.println("Queue is empty");
        else {
            System.out.println(arr[front] + " dequeued");
            front = (front + 1) % arr.length;
            count--;
        }
    }

    void display() {
        if (count == 0) System.out.println("Queue is empty");
        else {
            System.out.print("Queue (front to rear): ");
            for (int i = 0; i < count; i++)
                System.out.print(arr[(front + i) % arr.length] + " ");
            System.out.println();
        }
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        Queue q = new Queue(sc.nextInt());
        int ch;
        do {
            System.out.println("\n1.Enqueue 2.Dequeue 3.Display 4.Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    q.enqueue(sc.nextInt());
                    break;
                case 2: q.dequeue(); break;
                case 3: q.display(); break;
                case 4: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice");
            }
        } while (ch != 4);
    }
}
