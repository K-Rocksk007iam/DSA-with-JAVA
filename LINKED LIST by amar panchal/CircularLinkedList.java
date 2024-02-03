import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class CircularLinkedList {
    Node root, last;

    void createList() {
        root = last = null;// root is not created but assigned
    }

    void insertLeft(int data) {
        Node n = new Node(data);// created node
        if (root == null)// not created
        {
            root = last = n;// 1st one assigned as root
            last.next = root;
        } else {
            n.next = root;// 1
            root = n;// 2
            last.next = root;// 3
        }
        System.out.println("Inserted");
    }

    void deleteLeft() {
        if (root == null)// not created
        {
            System.out.println("List Empty:");
        } else {
            Node t = root;// 1
            if (root == last)
                root = last = null;
            else {
                root = root.next;// 2
                last.next = root;// 3
            }
            System.out.println(t.data + " deleted");
        }
    }

    void deleteRight() {
        if (root == null)// not created
        {
            System.out.println("List Empty:");
        } else {
            Node t = root;// 1
            Node t2 = root;// 1
            while (t != last)// 2
            {
                t2 = t;
                t = t.next;
            }
            if (t == root)// single node only
                root = last = null;// maual deletion
            else {
                last = t2;// 3
                last.next = root;// 4
            } // 3
            System.out.println(t.data + " deleted");
        }

    }

    void insertRight(int data) {
        Node n = new Node(data);// created node
        if (root == null)// not created
        {
            root = last = n;// 1st one assigned as root
            last.next = root;
        } else {
            last.next = n;// 1
            last = n;// 2
            last.next = root;// 3
        }
        System.out.println("Inserted");
    }

    void printList() {
        if (root == null)// not created
        {
            System.out.println("Empty list:");
        } else {
            Node t = root;// 1
            do {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            } while (t != root);// 2
        }
    }

    public static void main(String args[]) {
        CircularLinkedList obj = new CircularLinkedList();
        Scanner in = new Scanner(System.in);
        int ch, e;
        obj.createList();// creating LinkedList
        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left:\n4.Delete right\n5.Print\n0.Exit :");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insertLeft(e);
                    System.out.println("Element Inserted");
                    break;

                case 2:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insertRight(e);
                    System.out.println("Element Inserted");
                    break;

                case 3:
                    obj.deleteLeft();
                    break;

                case 4:
                    obj.deleteRight();
                    break;
                case 5:
                    obj.printList();
                    break;
                case 0:
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Wrong option selected");
                    break;

            }

        } while (ch != 0);
    }
}