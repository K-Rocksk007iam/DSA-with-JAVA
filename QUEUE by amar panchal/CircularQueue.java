import java.util.Scanner;

public class CircularQueue {
    private int front, rear, maxSize;
    private int queue[];
    int count;


    void createQueue(int size) {
        maxSize = size;
        front = 0;
        rear = -1;
        count = 0;
        queue = new int[size];

    }

    void enQueue(int e) {
        rear = (rear + 1) % maxSize;
         count++;
        queue[rear] = e;
       
    }

    boolean isFull() {
        if (count  == maxSize) {
            return true;
        } else {
            return false;
        }
    }

    int deQueue() {
        int temp = queue[front];
        front = (front + 1) % maxSize;
        
        count--;
        return temp;

    }

    boolean isEmpty() {
        if (count ==0) {
            return true;
        } else {
            return false;
        }
    }

    void printQueue() {

        int i=front;
        int c=0;
        while (c<count) {
            System.out.print(queue[i]+"--");
            i=(i+1)%maxSize;
            c++;
        }
    }

    public static void main(String[] args) {
        CircularQueue obj = new CircularQueue();
        Scanner in = new Scanner(System.in);
        int ch;
        System.out.println("Enter size of QUEUE:");
        int size = in.nextInt();
        obj.createQueue(size);// creating stack
        do {
            System.out.println("\n1.enqueue\n2.dequeue\n3.Print:\n0.Exit :");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    if (obj.isFull() != true) {
                        System.out.println("ENTER DATA:");
                        int e = in.nextInt();
                        obj.enQueue(e);
                        System.out.println(e + " is pushed");
                    } else {
                        System.out.println("QUEUE Full");
                    }
                    break;
                case 2:
                    if (obj.isEmpty() != true) {
                        int e = obj.deQueue();
                        System.out.println(e + " poped");
                    } else {
                        System.out.println("queue Empty");
                    }
                    break;
                case 3:
                    if (obj.isEmpty() != true) {
                        obj.printQueue();
                    } else {
                        System.out.println("queue Empty");
                    }
                    break;
                case 4:

                case 0:
                    System.out.println("Exiting thank for using code");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;

            }

        } while (ch != 0);
    }
}
