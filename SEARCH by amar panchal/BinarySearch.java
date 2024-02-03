
import java.util.Scanner;

public class BinarySearch {

    int a[], size;

    void input(int size) {
        this.size = size;
        a = new int[this.size];
        Scanner in = new Scanner(System.in);
        System.out.println("\nENTER :" + this.size + " element");

        for (int i = 0; i < size; i++) {
            System.out.print("ENTER ELEMENT :");
            a[i] = in.nextInt();

        }

    }

    void display() {
        System.out.println("\nARRAY HAS :");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    void binary_search(int start, int end, int key) {
        if (start < end) {
            int mid = (start + end) / 2;
            if (key == a[mid])
                System.out.println("FOUND ");
            else if (key < a[mid])
                binary_search(start, mid - 1, key);
            else
                binary_search(mid + 1, end, key);
        } else {
            System.out.println("NOT FOUND");
        }

    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE");
        int size = sc.nextInt();
        obj.input(size);

        obj.display();
        System.out.println("\nENTER KEY TO SEARCH :");
        int key = sc.nextInt();
        obj.binary_search(0, size, key);

    }
}
