import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }

}

public class TreeExample {
    Node root;
    static int size, leaf = 0;

    void createTree() {
        root = null;
    }

    void insert(Node r, Node n) {
        if (root == null) {
            root = n;
        } else {
            if (n.data < r.data) {
                if (r.left == null) {
                    r.left = n;
                } else {
                    insert(r.left, n);
                }
            } else {
                if (r.right == null)
                    r.right = n;

                else

                    insert(r.right, n);

            }
        }
    }

    void inorder(Node r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + "--");
            inorder(r.right);
        }
    }

    void preorder(Node r) {
        if (r != null) {
            System.out.print(r.data + "--");
            preorder(r.left);
            preorder(r.right);
        }
    }

    void postorder(Node r) {
        if (r != null) {

            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + "--");
        }
    }

    void countNodesTotal(Node r) {
        if (r != null) {
            countNodesTotal(r.left);
            TreeExample.size++;
            countNodesTotal(r.right);
        }
    }

    void countNodeOnlyLeaf(Node r) {
        if (r != null) {
            countNodeOnlyLeaf(r.left);
            if (r.left == null && r.right == null)
                TreeExample.leaf++;
            countNodeOnlyLeaf(r.right);

        }
    }

    void search(Node r, int key) {
        if (root == null)
            System.out.println("EMPTY");
        else {
            if (r.data == key) {
                System.out.println("FOUND");
                return;
            } else if (key < r.data) {

                search(r.left, key);
            }

            else {

                search(r.right, key);

            }
        }
    }

    public static void main(String a[]) {
        TreeExample obj = new TreeExample();

        Scanner in = new Scanner(System.in);
        int ch;
        obj.createTree();// creating tree
        do {
            System.out.println("1.Inorder\n2.preorder\n3.postorder\n4.Insert\n5.Count\n6.Find key\n7.Count total leaf\n0.Exit :");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("INORDER");
                    obj.inorder(obj.root);
                    break;

                case 2:
                    System.out.println("PREORDER");
                    obj.preorder(obj.root);
                    break;

                case 3:
                    System.out.println("POSTORDER");
                    obj.postorder(obj.root);
                    break;

                case 4:
                    System.out.println("ENTER ELEMENT TO INSERT");

                    obj.insert(obj.root, new Node(in.nextInt()));
                    break;

                case 5:

                    TreeExample.size = 0;
                    obj.countNodesTotal(obj.root);
                    System.out.println("TOTAL NODES :" + TreeExample.size);
                    break;

                case 6:
                    System.out.println("ENTER ELEMENT TO SEARCH :");

                    obj.search(obj.root, in.nextInt());
                    break;

                case 7:
                    TreeExample.leaf = 0;
                    obj.countNodeOnlyLeaf(obj.root);
                    System.out.println("TOTAL LEAF NODES :" + TreeExample.leaf);
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
