public class Factorial {

    public static int  printFactorial(int n) {
        if(n==1 | n==0){
            return 1;
        }
        int fact=printFactorial(n-1);;
        int facto=n*fact;
        return facto;
        
    }
    public static void main(String[] args) {
        int n=5;
        int sum =printFactorial(n);
        System.out.println(sum);

        
    } 
        
    
    
}
