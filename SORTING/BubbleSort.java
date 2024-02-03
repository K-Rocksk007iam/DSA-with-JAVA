import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;
//time complexit O(n^2)

public class BubbleSort {
    //function
    //to print element
    public static void print(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String args[]) {
        //bubble Sort
        int arr[] ={7 , 3 , 2 , 5 , 3 , 1};
        //outer loop runs n-1 times
        for(int i=0;i<arr.length;i++) {
        // we have to run inner loop n-1 times , n-2 times , n-3 times so "n-i-1"
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    //swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        print(arr);
    }
    
}
