import java.util.Scanner;

class Node {
    int data;
    Node left, right, next;

    Node(int data) {
        this.data = data;
        left = right = next = null;
    }
}

public class CircularDoublyLinkedList {
    Node root;

    void createList() {
        root = null;// root is not created but assigned
    }

    void insertLeft(int data) {
        Node n = new Node(data);// created node
        if (root == null)// not created
        {
            root = n;// 1st one assigned as root
            n.next = n;
        } else {
            n.right = root;// 1
            root.left = n;// 2
            n.next = root.next;
            root.next = n;// 3
        }
        System.out.println("Inserted");
    }

    void deleteLeft() {
        if (root == null)// not created
        {
            System.out.println("List Empty:");
        } else {
            Node t = root;// 1
            if (root.right == root)// single node
                root = null;
            else {
                root.right.left = root.left;// 2
                root.left.next = root.right;// 3
                root = root.right;
            }
            System.out.println(t.data + " deleted");
        }
    }

    void deleteRight() {
        if (root == null)// not created
            System.out.println("List Empty:");
        else {
            Node t = root;// 1
            while (t.right != null)// 2
                t = t.right;
            if (t == root)// single node only
                root = null;// maual deletion
            else {
                t.left.right = null;
                t.next = null;
            } // 3
            System.out.println(t.data + " deleted");
        }

    }

    void insertRight(int data) {
        Node n = new Node(data);// created node
        if (root == null)// not created
        {
            root = n;// 1st one assigned as root
            n.next = n;
        } else {
            Node t = root;// 1
            while (t.right != null) {// 2
                t = t.right;
            }
            t.right = n;// 3
            n.left = t;// 4
            n.next = root;
        }
        System.out.println("Inserted");
    }

    void printListLR() {
        if (root == null)// not created
        {
            System.out.println("Empty list:");
        } else {
            Node t = root;// 1
            while (t != null) {
                System.out.print("|" + t.data + "|->");
                t = t.right;
            }
        }
    }

    void printListRL() {
        if (root == null)// not created
        {
            System.out.println("Empty list:");
        } else {
            Node t = root;// 1
            while (t.right != null)// 2
                t = t.left;
            while (t != null)// 3
            {
                System.out.print("|" + t.data + "|->");
                t = t.right;
            }
        }
    }

    public static void main(String args[]) {
        CircularDoublyLinkedList obj = new CircularDoublyLinkedList();
        Scanner in = new Scanner(System.in);
        int ch, e;
        obj.createList();// creating LinkedList
        do {
            System.out.println(
                    "\n1.Insert Left\n2.Insert Right\n3.Delete Left:\n4.Delete right\n5.Print(Start to End)\n6.Print(End to Start)\n0.Exit :");
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
                    obj.printListLR();
                    break;
                case 6:
                    obj.printListRL();
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
