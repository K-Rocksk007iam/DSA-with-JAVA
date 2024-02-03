import java.util.Scanner;

// DYNAMIC QUEUE

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class QueueImplementingLinkedList {
    Node front, rear;

    void createQueue() {
        front = rear = null;// root is not created but assigned
    }

    void dequeue() {
        if (front == null)// not created
        {
            System.out.println("Queue is Empty:");
        } else {
            Node t = front;// 1
            if (front == rear) {
                front = rear = null;
            } else {
                front = front.next;// 2
            }
            System.out.println(t.data + " dequeued");
        }
    }

    void enqueue(int data) {
        Node n = new Node(data);// created node
        if (rear == null)// not created
        {
            front = rear = n;// 1st one assigned as root
        } else {
            rear.next = n;
            rear = n;
        }
        System.out.println("Inserted");
    }

    void printQueue() {
        if (front == null)// not created
        {
            System.out.println("Empty queue:");
        } else {
            Node t = front;// 1
            while (t != null)// 2
            {
                System.out.print("|" + t.data + "|---");
                t = t.next;
            }
        }
    }

    public static void main(String args[]) {
        QueueImplementingLinkedList obj = new QueueImplementingLinkedList();
        Scanner in = new Scanner(System.in);
        int ch;
        obj.createQueue();// creating stack
        do {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print:\n0.Exit :");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element:");
                    int e = in.nextInt();
                    obj.enqueue(e);
                    break;

                case 2:
                    obj.dequeue();
                    break;

                case 3:
                    obj.printQueue();
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