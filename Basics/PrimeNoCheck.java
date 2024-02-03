import java.*;
public class PrimeNoCheck {

    public static boolean isPrime(int n){

        if(n==2){
            return true;
        }
// prime numbers start from 2
        for(int i=2;i<=n-1;i++){ // optimized = for(int i=2;i<+math.sqrt(n);i++)
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(12));
        
    }
    
}
