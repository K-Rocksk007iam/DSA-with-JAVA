public class BinaryStringPrint {


    public static void printString(int n , int last, String str) {
        if(n==0){
            System.out.println(str);
            return;
        }
        printString(n-1, 0, str+"0");
    if(last==0){
        printString(n-1, 1, str+"1");
    }        
        
    }
    public static void main(String[] args) {
        printString(3, 0, " ");
    }
    
}
