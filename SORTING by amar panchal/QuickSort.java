public class QuickSort {
    void quickSort(int a[], int start, int end) {

        int i = start;
        int j = end;
        while (i < j) {
            int pivot = a.length/2;

            while (a[i] < a[pivot]) {
                i++;
            }
            while (a[j] > a[pivot]) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }

        }
        if (i < end) {
            quickSort(a, i + 1, end);
        }
        //one of the both should run
       else if (j > start) { 
            quickSort(a, start, j - 1);
        }
    }

    void display(int a[]) {
        System.out.println("\nARRAY HAS :");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "-");
        }

    }

    public static void main(String[] args) {
        QuickSort obj = new QuickSort();
        int a[] = { 23, 12, 56, 2, 8, 4 };

        obj.display(a);
        obj.quickSort(a, 0, a.length - 1);
        System.out.println("\nAFTER SORT");
        obj.display(a);
    }
}
