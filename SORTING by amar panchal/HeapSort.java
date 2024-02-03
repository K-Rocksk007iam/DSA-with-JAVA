public class HeapSort {
    void heapSort(int a[]) {
        int i, j, pc, temp;
        boolean flag = true;
        for (i = a.length - 1; i > 0; i--) {
            for (j = 0; j <= i; j++) {
                pc = j;
                flag = true;
                while (pc > 0 && pc / 2 >= 0 && flag != false) {
                    if (a[pc / 2] > a[pc]) {

                        flag = false;
                    }
                    if (a[pc] > a[pc / 2])// child >then parent then swap
                    {

                        temp = a[pc];
                        a[pc] = a[pc / 2];
                        a[pc / 2] = temp;
                        pc = pc / 2;// compare parent to grand parent

                    }
                }

                // swap last with root
                temp = a[0];
                a[0] = a[i];
                a[i] = temp;

            }
        }
    }

    void display(int a[]) {
        System.out.println("\nARRAY HAS :");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "|");
        }

    }

    public static void main(String[] args) {
        HeapSort obj = new HeapSort();
        int a[] = { 5,10,1,18,6,22,11 };

        obj.display(a);
        obj.heapSort(a);
        System.out.println("\nAFTER SORT");
        obj.display(a);
    }
}
