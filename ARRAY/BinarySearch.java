import java.util.*;
public class BinarySearch {
    //binary search only works on sorted array
    public static int binarySearch(int numbers[],int key) {
        int start=0; 
        int end=numbers.length-1;
        while(start<=end){

            int mid=(start+end)/2;
            
            if(numbers[mid]==key){
                return mid;
            }
            
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

           
        }
        return end;
        

        
    }
    public static void main(String[] args) {
        int numbers[]= {1,2,3,4,5,6};
        int key=25;
        System.out.println("number at index "+binarySearch(numbers, key));
    }
    
}
