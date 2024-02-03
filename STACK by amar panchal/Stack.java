import java.util.Scanner;

class Stack {

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

    public void printStack() {
        for (int i = tos; i > 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public int peek() {
        return stack[tos];

    }

    public static void main(String[] args) {
        Stack obj = new Stack();
        Scanner in = new Scanner(System.in);
        int ch;
        System.out.println("Enter size of stack:");
        int size = in.nextInt();
        obj.createStack(size);// creating stack
        do {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print:\n0.Exit :");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    if (obj.isFull() != true) {
                        System.out.println("ENTER DATA:");
                        int e = in.nextInt();
                        obj.push(e);
                        System.out.println(e + " is pushed");
                    } else {
                        System.out.println("Stack Full");
                    }
                    break;
                case 2:
                    if (obj.isEmpty() != true) {
                        int e = obj.pop();
                        System.out.println(e + " poped");
                    } else {
                        System.out.println("Stack Empty");
                    }
                    break;
                case 3:
                    if (obj.isEmpty() != true) {
                        int e = obj.peek();
                        System.out.println(e + " is at peek");
                    } else {
                        System.out.println("Stack Empty");
                    }
                    break;
                case 4:
                    if (obj.isEmpty() != true) {
                        obj.printStack();
                    } else {
                        System.out.println("Stack Empty");
                    }
                    break;
                case 0:
                    System.out.println("Exiting thank for using code");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;

            }

        } while (ch != 0);
    }
}
