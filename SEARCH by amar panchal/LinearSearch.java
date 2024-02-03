import java.util.Scanner;

public class LinearSearch {

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

    int linearSearch(int key) {
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                System.out.println(a[i] + " FOUND AT INDEX " + i);
            }

        }
        return -1;
    }

    void display() {
        System.out.println("\nARRAY HAS :");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE");
        int size = sc.nextInt();
        obj.input(size);
        obj.display();
        System.out.println("ENTER KEY TO SEARCH :");
        int key = sc.nextInt();

        obj.linearSearch(key);

    }
}