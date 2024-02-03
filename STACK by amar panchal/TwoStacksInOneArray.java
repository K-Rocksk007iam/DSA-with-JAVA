import java.util.Scanner;

public class TwoStacksInOneArray {
    private int maxSize;
    private int[] arr;
    private int top1, top2;

    public TwoStacksInOneArray(int size) {
        maxSize = size;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    public void push(int stackNum, int data) {
        if (top1 + 1 == top2) {
            System.out.println("Stacks are full. Cannot push.");
        } else {
            if (stackNum == 1) {
                top1++;
                arr[top1] = data;
                System.out.println(data + " pushed onto stack 1.");
            } else if (stackNum == 2) {
                top2--;
                arr[top2] = data;
                System.out.println(data + " pushed onto stack 2.");
            } else {
                System.out.println("Invalid stack number.");
            }
        }
    }

    public int pop(int stackNum) {
        if (stackNum == 1) {
            if (top1 == -1) {
                System.out.println("Stack 1 is empty.");
                return -1; 
            }
            int data = arr[top1];
            arr[top1] = 0; 
            top1--;
            System.out.println(data + " popped from stack 1.");
            return data;
        } else if (stackNum == 2) {
            if (top2 == maxSize) {
                System.out.println("Stack 2 is empty.");
                return -1; 
            }
            int data = arr[top2];
            arr[top2] = 0; 
            top2++;
            System.out.println(data + " popped from stack 2.");
            return data;
        } else {
            System.out.println("Invalid stack number.");
            return -1; 
        }
    }

    public void printStack(int stackNum) {
        if (stackNum == 1) {
            System.out.println("Stack 1:");
            for (int i = 0; i <= top1; i++) {
                System.out.println(arr[i]);
            }
        } else if (stackNum == 2) {
            System.out.println("Stack 2:");
            for (int i = maxSize - 1; i >= top2; i--) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("Invalid stack number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoStacksInOneArray twoStacks = new TwoStacksInOneArray(10);
        int stackNum;
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Print");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter stack number (1 or 2): ");
                    stackNum = sc.nextInt();
                    System.out.print("Enter data to push: ");
                    int data = sc.nextInt();
                    twoStacks.push(stackNum, data);
                    break;
                case 2:
                    System.out.print("Enter stack number (1 or 2): ");
                    stackNum = sc.nextInt();
                    int poppedData = twoStacks.pop(stackNum);
                    if (poppedData != -1) {
                        System.out.println("Popped element: " + poppedData);
                    }
                    break;
                case 3:
                    System.out.print("Enter stack number (1 or 2): ");
                    stackNum = sc.nextInt();
                    twoStacks.printStack(stackNum);
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
