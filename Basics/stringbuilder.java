import java.util.*;

public class stringbuilder {
    public static void main(String args[]) {
        
    
    StringBuilder sb = new StringBuilder("hello word");
    //insert char
    sb.insert(2,'s');//hesllo word

    //delete char
    sb.delete(2,3);//hello word

    //append (add something at end)
    sb.append(" "+"java");//hello word java

    //print length
    System.out.println(sb.length());
    
    
    System.out.println(sb);
    
}
}
