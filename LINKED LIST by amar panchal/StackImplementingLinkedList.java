import java.util.Scanner;

//DYNAMIC STACK

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class StackImplementingLinkedList {
    Node tos;

    void createStack() {
        tos = null; // whoever is a first is a root
    }

    void push(int data) {
        Node n = new Node(data);

        if (tos == null) {
            tos = n;
        } else {
            n.next = tos;
            tos = n;
            System.out.println("PUSHED");
        }
    }

    void pop() {

        if (tos == null) {
            System.out.println("STACK EMPTY");
        } else {
            Node t = tos;
            tos = tos.next;
            System.out.println(t.data + " POPED");
        }
    }

    void peek() {
        if (tos == null)// not created
        {
            System.out.println("Stack is Empty:");
        } else {
            System.out.println(tos.data + " @ Peek");
        }
    }

    void printStackElement() {

        if (tos == null) {
            System.out.println("EMPTY LIST");
        } else {
            Node t = tos;
            while (t != null) {
                System.out.print("|" + t.data + "|->");
                t = t.next;

            }
        }
    }

    public static void main(String[] args) {
        StackImplementingLinkedList obj = new StackImplementingLinkedList();
        Scanner in = new Scanner(System.in);
        int ch;

        obj.createStack();// creating stack
        do {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print:\n0.Exit :");
            ch = in.nextInt();
            switch (ch) {
                case 1:

                    System.out.println("ENTER DATA:");
                    int e = in.nextInt();
                    obj.push(e);

                    break;
                case 2:

                    obj.pop();

                    break;
                case 3:

                    obj.peek();

                    break;
                case 4:

                    obj.printStackElement();

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
