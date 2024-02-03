public class SelectionSort {
    public static void print(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        
    //time compexity O(n^2)   
    //Bubble sort
    int arr[] = {1 ,5 ,4 ,3 ,6 ,8 ,2};
    //outer loop will run n-1 times
    for(int i=0;i<arr.length-1;i++){
        int smallest = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[smallest]>arr[j]){
                smallest=j;
            }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]= temp;
        }
        print(arr);
    }
    
}
