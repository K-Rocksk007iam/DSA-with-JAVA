import java.util.Scanner;

public class Patterns{
    public static void main(String args[]) {
        // inner loop for colums(j) outer loops for rows(i)
        //print *
    /*    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    
        //hollow rectangle
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    
    
        //pyramid left side
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
        //reverse pyramid
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
      
        //pyramid right side
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //outer loop
        for(int i=1;i<=n;i++){
             //for loop for space (space should be n-i)
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
             //for loop for star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    
       //pyramid of number right side
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
         
        //pyramid of  inverted number left side
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=n-i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
     
        //right side inverted pyramid
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    
        //floyds triangle
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    
        //0-1 triangle
        // we have to make matrix first(i+j)

         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         for(int i=1;i<=n;i++){
             for(int j=1;j<=i;j++){
                 int sum = i+j;
                 if(sum % 2 ==0){
                     System.out.print("1");
                 }
                 else{
                     System.out.print("0");
                 }
             }
             System.out.println();
         }
   
        //butterfly pattern
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //upper half
        for(int i=1;i<=n;i++){
            //1st half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int sum = 2*(n-i);
            for(int j=1;j<=sum;j++){
                System.out.print(" ");
            }
            //2nd half
            for(int j=1;j<=i;j++){
                    System.out.print("*");
        }
        
        System.out.println();
    }
        //reverse the above code
        //value will be run from n to 1
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int sum = 2*(n-i);
            for(int j=1;j<=sum;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                    System.out.print("*");
        }
        System.out.println();
            
    
    }
    
         //rombus
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         //outer
         for(int i=1;i<=n;i++){
         //spaces
         for(int j=1;j<=n-i;j++){
             System.out.print(" ");
         }
         for(int j=1;j<=n;j++){
             System.out.print("*");
         }
         System.out.println();
        }

    
    // number pyramid
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int i=1;i<=n;i++){
         for(int j=1;j<=n-i;j++)
         {
             System.out.print(" ");
         }
         for(int j=1;j<=i;j++){
             System.out.print(i+" ");
         }
         System.out.println();
     }
     
     
       // palindromic pattern
      
       Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int sum = n-3;
       
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int j=i;j>=1;j--){
               System.out.print(j);
           }
           
           for(int j=sum;j<=i;j++){
               System.out.print(j);
           }
           System.out.println();
       }

       
      //diamond
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i=1;i<=n;i++){
          for(int j=1;j<=n-i;j++){
              System.out.print(" ");
          }
          for(int j=i;j<=2*i-1;j++){
              System.out.print("*"+" ");
          }
          System.out.println();
   
      }
      for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j<=2*i-1;j++){
            System.out.print("*"+" ");
        }
        System.out.println();
       
    }
   
    */
        

    }
    }
