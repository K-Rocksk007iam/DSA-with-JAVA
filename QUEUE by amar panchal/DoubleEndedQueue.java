import java.util.Scanner;

public class DoubleEndedQueue {
    private int front1, rear1, front2, rear2, maxSize;
    private int queue[];

    void createQueue(int size) {
        maxSize = size;
        front1 = 0;
        rear1 = -1;
        front2 = maxSize - 1;
        rear2 = maxSize;

        queue = new int[size];

    }

    void enQueue1(int e) {
        rear1++;
        queue[rear1] = e;
    }

    void enQueue2(int e) {
        rear2--;
        queue[rear2] = e;
    }

    boolean isFull1() {
        if (rear1 == maxSize - 1 && rear1 + 1 == rear2) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull2() {
        if (rear2 == 0 || rear2 - 1 == rear1) {
            return true;
        } else {
            return false;
        }
    }

    int deQueue1() {
        int temp = queue[front1];
        front1++;
        return temp;

    }

    int deQueue2() {
        int temp = queue[front2];
        front2--;
        return temp;

    }

    boolean isEmpty1() {
        if (front1 > rear1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty2() {
        if (front2 < rear2) {
            return true;
        } else {
            return false;
        }
    }

    void printQueue1() {
        for (int i = front1; i <= rear1; i++) {
            System.out.print(queue[i]+"-");
        }
    }

    void printQueue2() {
        for (int i = front2; i >= rear2; i--) {
            System.out.print(queue[i]+"-");
        }
    }

    public static void main(String[] args) {
        DoubleEndedQueue obj = new DoubleEndedQueue();
        Scanner in = new Scanner(System.in);
        int ch;
        System.out.println("Enter size of QUEUE:");
        int size = in.nextInt();
        obj.createQueue(size);// creating queue
        do {
            System.out.println("\n1.enqueue 1 \n2.enqueue 2 \n3.dequeue 1 \n4.dequeue 2 \n5.Print 1: \n6.print 2:\n0.Exit :");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    if (obj.isFull1() != true) {
                        System.out.println("ENTER DATA IN QUEUE 1:");
                        int e = in.nextInt();
                        obj.enQueue1(e); 
                        System.out.println(e + " is pushed");
                    } else {
                        System.out.println("QUEUE 1 Full");
                    }
                    break;

                case 2:
                    if (obj.isFull2() != true) {
                        System.out.println("ENTER DATA IN QUEUE 2:");
                        int e = in.nextInt();
                        obj.enQueue2(e);
                        System.out.println(e + " is pushed");
                    } else {
                        System.out.println("QUEUE 2 Full");
                    }
                    break;

                case 3:
                    if (obj.isEmpty1() != true) {
                        int e = obj.deQueue1();
                        System.out.println(e + " poped");
                    } else {
                        System.out.println("QUEUE 1 EMPTY");
                    }
                    break;

                case 4:
                    if (obj.isEmpty2() != true) {
                        int e = obj.deQueue2();
                        System.out.println(e + " poped");
                    } else {
                        System.out.println("QUEUE 2 EMPTY\"");
                    }
                    break;
                case 5:
                    if (obj.isEmpty1() != true) {
                        obj.printQueue1();
                    } else {
                        System.out.println("queue 1 Empty");
                    }
                    break;

                case 6:
                    if (obj.isEmpty2() != true) {
                        obj.printQueue2();
                    } else {
                        System.out.println("queue 2 Empty");
                    }
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
