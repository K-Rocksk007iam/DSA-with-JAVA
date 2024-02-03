public class SimplePascalsTriangle {
    //O(n^2)
    public static void main(String[] args) {
        int n=5;
        printPascal(n);

    }

    public static void printPascal(int n) {
        int[][] arr=new int[n][n]; //2D ARRAY IS DECLARED size of n*n
        //travel
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){ //i=n , j =r
                if(i==j || j==0) //nCr = 2N0=1 , 2N2=1
                    arr[i][j]=1;
                
                else
                    arr[i][j]=arr[i-1][j-1] + arr[i-1][j]; // sum of these 2 arr is reamaing elements in matrix
                    System.out.print(arr[i][j]+" ");
                
            }
            System.out.println("");
        }
        
    }
    
}
