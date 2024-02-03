//balanced parantheses

import java.util.Scanner;

public class Wellness {

    private char stack[];
    private int maxSize;
    private int tos;

    public void createStack(int size) {
        maxSize = size;
        tos = -1;
        stack = new char[maxSize];
    }

    public void push(char e) {
        tos++;
        stack[tos] = e;

    }

    public char pop() {
        char temp = stack[tos];

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
        Wellness obj = new Wellness();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter INPUT :");
        String input = sc.next();
        obj.createStack(input.length());
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            System.out.println("at " + i + " we have " + c);

            if (c == '{') {
                obj.push(c);
            } else if (c == '}') {
                if (obj.isEmpty() != true) {
                    char gc = obj.pop();
                } else {
                    System.out.println("{ NOT NEEDED ERROR");
                    flag = false;
                    break;
                }
            }

        }

        if (flag != false && obj.isEmpty() == true) {
            System.out.println("BALANCED");
        }

        if (flag == false && obj.isEmpty() == false) {
            System.out.println("} NEEDED ERROR");
        }

    }
}
