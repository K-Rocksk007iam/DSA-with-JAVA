import java.util.*;
public class SetMatrixZeroes {
                                                                  
    public static void setzeroes(int matrix[][]) {                

        int n=matrix.length;//dimensions
        int m=matrix[0].length;//dimensions
        boolean row=false, colm=false; 


        // travel
        //for colum
        for(int i=0;i<n;i++)if(matrix[i][0]==0)colm=true;  //ith row of 0th colm-index ,0_0_0_0


        //for row
        for(int j=0;j<m;j++)if(matrix[0][j]==0)row=true;    //ith colm of 0th row-index ,0|0|0|0 


        //we have completed work for edges
        //now for remaing elements
        for(int i=1;i<n;i++){//i=1 because we dont have to check i=0 we ignore the [0][0]
            for(int j=1;j<m;j++){

                if(matrix[i][j]==0){ // remaining elemnts is zero then we have to make edges zero
                    matrix[0][j]=0; //oth row jth colm
                    matrix[i][0]=0; //ith row 0th colm
                }
            }
        }

        //travel again
        //make whole row zero
        for(int i=1;i<n;i++){
            if(matrix[i][0]==0){ // if edges are zero we have to make whole ith row 0th colm zero
                for(int j=0;j<m;j++){
                    matrix[i][j]=0;
                }
            }
        }
        // make whole colm zero
        for(int j=1;j<m;j++){ // if edges are zero we have to make whole jth colm 0th row zero
            if(matrix[0][j]==0){
                for(int i=0;i<n;i++){
                    matrix[i][j]=0;
                }
            }
        }
        if(row){ // if row==true , we have to make whole row 0
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        if(colm){ // if colm==true , we have to make whole colm 0
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }

    }  
    public static void main(String[] args) {
        int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setzeroes(arr);
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
}
}