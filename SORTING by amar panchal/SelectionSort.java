public class SelectionSort {

    void selectionSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) { // for passes
            int min = a[i];
            int pos = i;
            for (int j = i + 1; j < a.length; j++) { // comparing till last element
                if (a[j] < min) {
                    min = a[j];
                    pos = j;
                }
            }
            a[pos] = a[i];
            a[i] = min;
        }

    }

    void selectionSortForDecending(int a[]) {
        for (int i = a.length - 1; i >= 0; i--) { // for passes
            int max = a[i];
            int pos = i;
            for (int j = i - 1; j >= 0; j--) { // comparing till last element
                if (a[j] < max) {
                    max = a[j];
                    pos = j;
                }
            }
            a[pos] = a[i];
            a[i] = max;
        }

    }

    void selectionSortForDecendingV2(int a[]) {
        for (int i = 0; i < a.length - 1; i++) { // for passes
            int min = a[i];
            int pos = i;
            for (int j = i + 1; j < a.length; j++) { // comparing till last element
                if (a[j] > min) {
                    min = a[j];
                    pos = j;
                }
            }
            a[pos] = a[i];
            a[i] = min;
        }

    }

    void display(int a[]) {
        System.out.println("\nARRAY HAS :");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "-");
        }

    }

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int a[] = { 23, 12, 56, 2, 8, 4 };

        obj.display(a);
        obj.selectionSort(a);
        System.out.println("\nAFTER SORT");
        obj.display(a);

        obj.selectionSortForDecending(a);

        System.out.println("\nAFTER SORT DECENDING");
        obj.display(a);
    }

}
