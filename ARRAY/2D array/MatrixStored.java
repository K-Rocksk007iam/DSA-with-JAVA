import java.util.Scanner;
import java.util.*;

public class MatrixStored {


    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Scanner sc = new Scanner(System.in);
       
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
            
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
       
    }
    
}
