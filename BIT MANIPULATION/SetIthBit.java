public class SetIthBit {
    public static int setIthbit(int n,int i) {
        return n|1<<i;
        
    }
    public static void main(String[] args) {
        int n;
        int i;
        System.out.println(setIthbit(10,2 ));
    }
    
}
