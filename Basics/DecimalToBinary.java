import java.util.*;
public class DecimalToBinary {

    public static void decimalToBinary(int deciNum){
        int binaryNum=0;
        int power=0;
        while(deciNum>0){
            int remainder=deciNum%2;
            binaryNum=binaryNum+(remainder*(int)Math.pow(10,power));
            power++;
            deciNum/=2;
        }
        System.out.println(binaryNum);
    }


    public static void main(String[] args) {
        decimalToBinary(56);
        
    }
    
}
