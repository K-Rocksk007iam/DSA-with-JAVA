
import java.util.*;
public class LinearQueue {
    private int front, rear, maxSize;
    private int queue[];
    

    void createQueue(int size) {
        maxSize = size;
        front = 0;
        rear = -1;
        queue = new int[size];

    }

    void enQueue(int e) {
        rear++;
        queue[rear] = e;
    }

    boolean isFull() {
        if (rear == maxSize - 1) {
            return true;
        } else {
            return false;
        }
    }

    int deQueue() {
        int temp = queue[front];
        front++;
        return temp;
    
    
}
    boolean isEmpty(){
        if(front>rear){
            return true;
        }
        else{
            return false;
        }
    }

    void printQueue() {
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
    LinearQueue obj = new LinearQueue();
        Scanner in = new Scanner(System.in);
        int ch;
        System.out.println("Enter size of QUEUE:");
        int size = in.nextInt();
        obj.createQueue(size);// creating stack
        do {
            System.out.println("\n1.enqueue\n2.dequeue\n3Print:\n0.Exit :");
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
