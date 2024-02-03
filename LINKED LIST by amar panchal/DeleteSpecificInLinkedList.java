
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class DeleteSpecificInLinkedList {
    Node root;

    void createList() {
        root = null;// root is not created but assigned
    }

    void insertLeft(int data) {
        Node n = new Node(data);// created node
        if (root == null)// not created
        {
            root = n;// 1st one assigned as root
        } else {
            n.next = root;// 1
            root = n;// 2
        }
        System.out.println("Inserted");
    }

    void deleteLeft() {
        if (root == null)// not created
        {
            System.out.println("List Empty:");
        } else {
            Node t = root;// 1
            root = root.next;// 2
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
            while (t.next != null)// 2
            {
                t2 = t;
                t = t.next;
            }
            if (t == root)// single node only
                root = null;// maual deletion
            else
                t2.next = null;// 3
            System.out.println(t.data + " deleted");
        }

    }

    void insertRight(int data) {
        Node n = new Node(data);// created node
        if (root == null)// not created
        {
            root = n;// 1st one assigned as root
        } else {
            Node t = root;// 1
            while (t.next != null)// 2
                t = t.next;
            t.next = n;// 3
        }
        System.out.println("Inserted");
    }

    void printList() {
        if (root == null)// not created
        {
            System.out.println("Empty list:");
        } else {
            Node t = root;// 1
            while (t != null)// 2
            {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
        }
    }

    void searchList(int key) {
        if (root == null)// not created
        {
            System.out.println("Empty list:");
        } else {
            Node t = root;// 1
            while (t != null)// 2
            {
                if (key == t.data) {
                    System.out.println("Found in list");
                    break;
                }
                t = t.next;
            }
            if (t == null)// when not found then only
                System.out.println(key + " Not Found in list");
        }
    }

    void deleteonKey(int key) {
        if (root == null)// not created
        {
            System.out.println("Empty list:");
        } else {
            Node t = root;//
            Node t2 = root;
            while (t != null)// 2
            {
                if (key == t.data)
                    break;
                t2 = t;
                t = t.next;
            }
            if (t == null)// when not found then only
                System.out.println(key + " Not Found in list");
            else// found as t is no null
            {
                if (t == root)// first
                    root = root.next;
                else if (t.next == null)// last
                    t2.next = null;
                else// in-between
                    t2.next = t.next;
                System.out.println(t.data + "Found in list and deleted");
            }
        }
    }

    void insertBefore(int key, int data) {
        if (root == null)// not created
        {
            System.out.println("Empty list:");
        } else {
            Node t = root;//
            Node t2 = root;
            while (t != null)// 2
            {
                if (key == t.data)
                    break;
                t2 = t;
                t = t.next;
            }
            if (t == null)// when not found then only
                System.out.println(key + " Not Found in list");
            else// found as t is no null
            {
                Node n = new Node(data);
                if (t == root)// insert left before root
                {
                    n.next = root;
                    root = n;// insert left
                } else {
                    t2.next = n;
                    n.next = t;
                }
                System.out.println(data + "inserted in list");
            }
        }
    }

    void insertAfter(int key, int data) {
        if (root == null)// not created
        {
            System.out.println("Empty list:");
        } else {
            Node t = root;//
            
            while (t != null)// 2
            {
                if (key == t.data)
                   
                break;
                t = t.next;
            }
            if (t == null)// when not found then only
                System.out.println(key + " Not Found in list");
            else// found as t is no null
            {
                Node n = new Node(data);
                
                    n.next=root.next;// insert right

               
                System.out.println(data + "inserted in list");
            }
        }
    }

    int List_length() {
        if (root == null)// not created
            return 0;
        else {
            Node t = root;// 1
            int count = 0;
            while (t != null)// 2
            {
                count++;
                t = t.next;
            }
            return (count);
        }
    }

    public static void main(String args[]) {
        DeleteSpecificInLinkedList obj = new DeleteSpecificInLinkedList();
        Scanner in = new Scanner(System.in);
        int ch, e;
        obj.createList();// creating LinkedList
        do {
            System.out.println(
                    "\n1.Insert Left\n2.Insert Right\n3.Delete Left:\n4.Delete right\n5.Print\n6.Length of List\n7 Search in list\n8.Delete on key\n9.Insert before a key: \n10.Insert after a key\n0.Exit :");
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
                case 6:
                    System.out.println("Length of list is:" + obj.List_length());
                    break;
                case 7:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.searchList(e);
                    break;
                case 8:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.deleteonKey(e);
                    break;
                case 9:
                    System.out.println("Enter element:");
                    int ref = in.nextInt();
                    System.out.println("Enter data:");
                    int data = in.nextInt();
                    obj.insertBefore(ref, data);
                    break;

                case 10:
                    System.out.println("Enter element:");
                    int ref1 = in.nextInt();
                    System.out.println("Enter data:");
                    int data2 = in.nextInt();
                    obj.insertAfter(ref1, data2);
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