public class BinaryToDecimal {
    
    public static void binaryToDecimal(int binNumber){
        int decimal=0;
        int power=0;
        while(binNumber>0){
            int lastDigit=binNumber%10; // to find last digit
            decimal=decimal+(lastDigit*(int)Math.pow(2, power));   //(int) is for type casting cause double cant be convert into integer
            power++;
            binNumber/=10; // to remove last digit


        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        binaryToDecimal(1000101);
        
    }
    
}
