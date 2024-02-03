public class Fibonacci {
    private static void calculateFibonacci(int n1,int n2,int count) {
        if(count==0){
            return;
        }
        int sum=n1+n2;
        System.out.print(" "+sum);
        calculateFibonacci(n2,sum,count-1); // n1=n2 , n2=sum,count--

   
    }
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        System.out.print(n1+" "+n2);
        int count=7;
        calculateFibonacci(n1,n2,count-2);//first two elements are alredy printed

        
    }
    
}
