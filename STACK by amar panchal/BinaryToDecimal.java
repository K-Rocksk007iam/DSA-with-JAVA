import java.util.Scanner;

public class BinaryToDecimal {

    private int stack[];
    private int maxSize;
    private int tos;

    public void createStack(int size) {
        maxSize = size;
        tos = -1;
        stack = new int[maxSize];
    }

    public void push(int e) {
        tos++;
        stack[tos] = e;

    }

    public int pop() {
        int temp = stack[tos];

        tos--;
        return temp;
    }

    public boolean isFull() {
        if (tos == maxSize - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (tos == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        BinaryToDecimal obj = new BinaryToDecimal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter INPUT :");
        int size = sc.nextInt();
        obj.createStack(size);
        int binary;
        while (size > 0) {
            obj.push(size % 2);
            size = size / 2;
            binary = size % 2;

        }
        System.out.print("(");
        while (obj.isEmpty() != true) {

            System.out.print(obj.pop()+" ");

        }
        System.out.print(")");
    }

}
