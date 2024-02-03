import java.util.Scanner;

public class loops {
    public static void main(String args[]) {
    /*    
        for(int i=0;i<10;i++)
        {
            System.out.print(i+ " ");
        }
    
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for(int i=1;i<=n;i++)
    {
        sum = sum + i ;
    }
    System.out.println(sum);
    */  
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum =0;
    for(int i=1;i<11;i++){
        sum = n*i ;
        System.out.println(sum);
    }
    
        
    }
    
}
