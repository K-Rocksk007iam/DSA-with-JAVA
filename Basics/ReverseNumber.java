public class ReverseNumber {
    public static void main(String[] args) {
        int n=123456;

// for printing reverse number
        /*while(n>0){
          int lastDigit =n%10;
            System.out.print(lastDigit+" ");
            n/=10;

        }
        System.out.println();
        */

//For entirely reverse number

        int rev=0;
        while(n>0){
            int lastDigit =n%10;
            rev=(rev*10)+lastDigit;
            n/=10;
            

        }
        System.out.println(rev);

    }
    
}
