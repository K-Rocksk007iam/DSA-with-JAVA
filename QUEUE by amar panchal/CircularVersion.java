import java.util.Scanner;

public class CircularVersion {
    private int front, rear, MaxSize;
    private int queue[];

    void createQueue(int size) {
        MaxSize = size;
        front = size / 2;
        rear = size / 2 + 1;
        queue = new int[size];
    }

    void enqueueL(int e) {
        if (front != -1) {
            queue[front] = e;
            front--;
        } else
            System.out.println("side full");
    }

    void enqueueR(int e) {
        if (rear != MaxSize ) {
            queue[rear] = e;
            rear++;
        } else
            System.out.println("side full");

    }

    void dequeueL() {
        if (front <= rear) {
            int temp = queue[front];
            front++;
            System.out.println(temp + " Removed");
        } else
            System.out.println("Empty");
    }

    void dequeueR() {
        if (front <= rear) {
            int temp = queue[rear];
            rear--;
            System.out.println(temp + " Removed");
        } else
            System.out.println("Empty");

    }

    void printQueueLR() {
        for (int i = front+1; i < rear; i++) {
            System.out.print(queue[i] + "--");
        }
    }

    void printQueueRL() {
        for (int i = rear-1; i > front; i--) {
            System.out.print(queue[i] + "--");
        }
    }

    public static void main(String args[]) {
        CircularVersion obj = new CircularVersion();
        Scanner in = new Scanner(System.in);
        int ch, e;
        System.out.println("Enter size of queue:");
        int size = in.nextInt();
        obj.createQueue(size);
        do {
            System.out.println(
                    "\n1.enqueue left \n2.enqueue right \n3.dequeue left \n4.dequeue right \n5.Print left to right \n6.print right to left\n0.Exit :");
            ch = in.nextInt();
            switch (ch) {
                case 1:

                    System.out.println("ENTER DATA IN QUEUE 1:");
                    e = in.nextInt();
                    obj.enqueueL(e);
                    System.out.println(e + " is pushed");
                    break;

                case 2:
                    System.out.println("ENTER DATA IN QUEUE 2:");
                    e = in.nextInt();
                    obj.enqueueR(e);
                    System.out.println(e + " is pushed");
                    break;
                case 3:
                    obj.dequeueL();
                    break;

                case 4:
                    obj.dequeueR();
                    break;
                case 5:
                        obj.printQueueLR();
                        break;
                case 6:
                        obj.printQueueRL();
                        break;
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