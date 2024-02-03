public class ClearithBit {

    public static int clearithBit(int n ,int i) {
        return n&~(1<<i);
        
    }
    public static void main(String[] args) {
        int n,i;
        System.out.println(clearithBit(10, 1));
    }
    
}
