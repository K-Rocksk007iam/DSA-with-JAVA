public class Intersection {
    public static void main(String args[]) {
        int arr1[]={1,2,3,4,5,7,8,9};
        int arr2[]={1,2,3,4,11,9};
        System.out.println("Interssection is ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
             
             if(arr1[i]==arr2[j]){
            System.out.print(arr1[i]+" ");
            i++;
          
        }
    
        
        }
    }
    
    }
        
    
    
}


