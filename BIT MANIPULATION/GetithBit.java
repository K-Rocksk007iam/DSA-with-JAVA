public class GetithBit {
    public static int getIthbit(int n, int i) {
        if((n&1<<i)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        int n;
        int i;
        System.out.println(getIthbit(10, 2));
    }
    
}
