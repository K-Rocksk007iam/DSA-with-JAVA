import javax.swing.text.StyledEditorKit.ForegroundAction;

public class SpiralMatrix {

    public static void printMatrix(int matrix[][]) {
        int startColumn=0;
        int startRow=0;
        int endColumn=matrix[0].length-1;
        int endRow=matrix.length-1;
        while(startRow<=endRow&&startColumn<=endColumn){

        //FOR TOP BOUNDARY
        for(int j=startRow;j<=endColumn;j++){
            System.out.print(matrix[startRow][j]+" " );
        }

        //FOR RIGHT BOUNDARY
        for(int i=startRow=1;i<=endRow;i++){
            System.out.print(matrix[i][endColumn]+" ");
        }

        //FOR BOTTOM BOUNDARY
        for(int j=endColumn-1;j>=startColumn;j--){
            if(startRow==endRow){
                break;
            }
            System.out.print(matrix[endRow][j]+" ");
        }

        //FOR LEFT BOUNDARY
        for(int i=endRow-1;i>=startRow+1;i--){
            if(startColumn==endColumn){
                break;
            }
            System.out.print(matrix[i][startColumn]+" ");
        }
        
        
        startColumn++;
        startRow++;
        endColumn--;
        endRow--;
        
    }
    System.out.println();

    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printMatrix(matrix);
    }
    
}
