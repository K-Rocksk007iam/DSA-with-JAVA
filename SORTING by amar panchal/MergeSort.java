public class MergeSort {
    void mergeSort(int a[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merger(a, start, mid, end);
        }
    }

    void merger(int a[], int start, int mid, int end) {
        int temp[] = new int[a.length];
        int tindex, i, j;
        i = start;
        j = mid + 1;
        tindex = start;
        while (i <= mid && j <= end) {
            if (a[i] < a[j]) {
                temp[tindex++] = a[i++];
            } else
                temp[tindex++] = a[j++];
        }

        while (i <= mid)
            temp[tindex++] = a[i++];
        while (j <= end)
            temp[tindex++] = a[j++];

        // copy backl to a
        for (i = start; i <= end; i++)
            a[i] = temp[i];
    }

    void display(int a[]) {
        System.out.println("\nARRAY HAS :");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "|");
        }

    }

    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        int a[] = { 23, -12, -56, 2, 8, 4 };

        obj.display(a);
        obj.mergeSort(a, 0, a.length - 1);
        System.out.println("\nAFTER SORT");
        obj.display(a);
    }
}
