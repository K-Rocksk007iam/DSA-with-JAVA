import java.util.Scanner;

public class BubbleSort {

    void bubbleSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) { // for passes
            for (int j = 0; j < a.length - 1; j++) { // comparing till last element
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

    }

    // to reduce number of passses
    void bubbleSortV2(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {// last element will not comapred becz it already sorted
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

    }

    // to reduce number of passses
    void bubbleSortV3(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = a.length - 1; j > 0; j--) {// sorting from last
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

    }

    void bubbleSortAlreadySorted(int a[]) {
        boolean flag = true;
        for (int i = 0; i < a.length - 1; i++) {
            flag = true;
            for (int j = 0; j < a.length - 1 - i; j++) {// comparing till last element

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = false;

                }

            }
            if (flag == true) {
                System.out.println("\nALREADY SORTED AFTER PASS " + i + 1);
                break;
            }
        }

    }

    void display(int a[]) {
        System.out.println("\nARRAY HAS :");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "-");
        }

    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int a[] = { 10, 20, 30, 40 };

        obj.display(a);
        obj.bubbleSortAlreadySorted(a);
        System.out.println("\nAFTER SORT");
        obj.display(a);
    }
}
