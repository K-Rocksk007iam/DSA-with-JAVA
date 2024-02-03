public class FindPowerOf_X {
    private static int calculatePower(int x ,int n) {
        if(x==0){
            return 0;//base 0 means 0(0^2=0)
        }
        if(n==0){
            return 1;//power 0 means 1(2^0=1)
        }

        int PowerOfX=calculatePower(x, n-1);//to calculate power = X * X^x-1 = x^n
        int power=x*PowerOfX;
        return power;
        
    }
    public static void main(String[] args) {
        int x=6;
        int n=2;
        int ans=calculatePower(x,n);
        System.out.println(ans);

        
    }
    
}
