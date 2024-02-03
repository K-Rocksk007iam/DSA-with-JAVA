import java.util.Scanner;

class Node {
    int data;
    Node next;
    int size;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class LinearLinkedList {
    Node root;

    void createList() {
        root = null; // whoever is a first is a root
    }

    void insertLeft(int data) {
        Node n = new Node(data);

        if (root == null) {
            root = n;
        } else {
            n.next = root;
            root = n;
            System.out.println("INSERTED");
        }
    }

    void deleteLeft() {

        if (root == null) {
            System.out.println("LIST EMPTY");
        } else {
            Node t = root;
            root = root.next;
            System.out.println(t.data + " DELETED");
        }
    }

    void insertRight(int data) {
        Node n = new Node(data);

        if (root == null) {
            root = n;
        } else {
            Node t = root;
            while (t.next != null) {
                t = t.next;
                t.next = n;
                System.out.println("INSERTED");
            }
        }
    }

    void deleteRight() {

        if (root == null) {
            System.out.println("LIST EMPTY");
        } else {
            Node t = root;
            Node t2 = root;

            while (t.next != null) {
                t2 = t;
                t = t.next;
            }
            if (t == root) {
                root = null;
            } else {
                t2.next = null;
                System.out.println(t.data + " DELETED");

            }

        }
    }

    void printList() {

        if (root == null) {
            System.out.println("EMPTY LIST");
        } else {
            Node t = root;
            while (t != null) {
                System.out.print("|" + t.data + "|->");
                t = t.next;

            }
        }
    }

    int listSize() {
        int size = 0;
        if (root == null) {
            return 0;
        } else {
            Node t = root;
            while (t != null) {
                size++;
                t = t.next;
            }
        }
        return size;
    }

    void searchingKey(int key) {

        if (root == null) {
            System.out.println("NOT FOUND | EMPTY");
        } else {
            Node t = root;
            while (t != null) {
                if (t.data == key) {
                    System.out.println("FOUND");
                    break;
                }
                t = t.next;
            }
            if(t==null){
                System.out.println("NOT FOUND");
            }

        }

    }

    public static void main(String[] args) {
        LinearLinkedList linklist = new LinearLinkedList();
        Scanner in = new Scanner(System.in);
        int ch, data, key;
        linklist.createList();
        do {
            System.out.println(
                    "\n1.INSERT LEFT\n2.INSERT RIGHT\n3.DELETE LEFT \n4.DELETE RIGHT\n5.PRINT \n6.size \n7.Search \n0.EXIT");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("ENTER DATA:");
                    data = in.nextInt();
                    linklist.insertLeft(data);
                    break;
                case 2:
                    System.out.println("ENTER DATA:");
                    data = in.nextInt();
                    linklist.insertLeft(data);
                    break;

                case 3:
                    linklist.deleteLeft();
                    break;
                case 4:
                    linklist.deleteRight();
                    break;
                case 5:
                    linklist.printList();
                    break;

                case 6:

                    System.out.println("SIZE IS :" + linklist.listSize());
                    break;

                case 7:
                    System.out.println("ENTER KEY TO SEARCH :");
                    key = in.nextInt();
                    linklist.searchingKey(key);
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
