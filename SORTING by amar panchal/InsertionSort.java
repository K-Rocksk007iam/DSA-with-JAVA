public class InsertionSort {
    void insertionnSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) { // for passes
            int element = a[i + 1];
            int j = i + 1;
            while (j > 0 && a[j - 1] > element) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = element;

        }

    }

    void display(int a[]) {
        System.out.println("\nARRAY HAS :");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "-");
        }

    }

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int a[] = { 23, 12, 56, 2, 8, 4 };

        obj.display(a);
        obj.insertionnSort(a);
        System.out.println("\nAFTER SORT");
        obj.display(a);

    }
}
