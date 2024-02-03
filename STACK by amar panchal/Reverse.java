public class Reverse {
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
        Reverse obj = new Reverse();
        String str = "KUNAL";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            obj.push(c);
            System.out.println(c);

        }
        String word="";
        while(obj.isEmpty()!=true){
            word=word+obj.pop();
        }
        System.out.println(word);
    }
}
