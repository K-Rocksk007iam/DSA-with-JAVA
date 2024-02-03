import java.util.*;
public class Reverse {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("KUNAL");
        
        for(int i=0;i<sb.length()/2;i++){
           
            int front = i;
            int back = sb.length()-1-i; // K la mage ghyaych asel tr (length - 1 -i)ie,(5-1-0(K chi index 0))=4 
           
            char frontchar =sb.charAt(front);
            char bachchar = sb.charAt(back);

            //reverse
            sb.setCharAt(front,bachchar);
            sb.setCharAt(back, frontchar);
        }  
        System.out.println(sb);
    }
    
}
