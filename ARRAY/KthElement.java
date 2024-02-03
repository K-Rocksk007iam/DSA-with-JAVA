import java.*;
public class KthElement {
    public static void main(String args[]) {
        int arr[]= {3,2,5,7,1,8,6};//input
        int k=3;//3rd largest
        //for largest we have to sort element by decending order 
        
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){ // for smallest a[i]>a[j] , elemnts will sorted by acending order
                    int temp = arr[i];//swapping
                    arr[i]=arr[j];
                    arr[j]=temp;
                    //sorted ement will be = 8 7 6 5 3 2 1 , so 3rd largest is 6
                }
            }
            if(i==k-1){//to acheive index k-1
                System.out.println("element found "+" "+arr[i] );
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
    
}
