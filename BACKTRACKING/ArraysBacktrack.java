public class ArraysBacktrack {

    public static void backtrackArray(int arr[],int i , int value) {
        //BASE CASE
        if(i==arr.length){
           printArray(arr);
           return;
        }
        
        
        //RECURSION
        arr[i]=value;
        backtrackArray(arr, i+1, value+1);
        arr[i]=arr[i]-2;//BACKTRACKING
        }
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[]=new int[5];
        backtrackArray(arr, 0, 1);
        printArray(arr);
    }
    
}
