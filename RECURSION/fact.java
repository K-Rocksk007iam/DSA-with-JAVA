public class fact {
    public static int factorial(int n) {
        if(n==0){
            return 1;
        }
        int facto=n*factorial(n-1);
        return facto;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(factorial(n));
    }
    
}
