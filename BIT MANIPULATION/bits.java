import java.util.Scanner;

public class bits {
    public static void main(String args[]) {
        // GET BIT (AND)
/*       
        int i = 5;//0101
        int pos = 3;
        int Bitsmask = 1<<pos;//0001 =1000

        if((Bitsmask & i) == 0){
            System.out.println("bit is zero");
        }
        else{
            System.out.println("bit is one");
        }

        //SET BIT (0=1) (OR)
        
        int i = 5;//0101
        int pos = 3;
        int Bitsmask = 1<<pos;//0001 =1101 (13)
        int newnum = Bitsmask | i;
        System.out.println(newnum);

       //CLEAR BIT (1=0) (& )
        
       int i = 5;//0101
        int pos = 2 ;
        int Bitsmask = 1<<pos;
        int not = ~(Bitsmask);//first perform not
        int newnum = not & i;//then perform and with original numbers
        System.out.println(newnum);
*/     
       //UPDATE BIT (FOR 1=0(CLEAR) & , ~) (FOR 0=1(SET) |)

       Scanner sc = new Scanner(System.in);
       int opr = sc.nextInt();
       int i = 5; //0101
       int pos = 1 ;
       int Bitsmask = 1<<pos;

       if(opr == 1){
           int newnum = Bitsmask | i;
           System.out.println(newnum);
       }
       else{
           int not = ~(Bitsmask);
           int newnum = not & i;
           System.out.println(newnum);
       }


         
        
    }
    
}
