public class arrayReverse {
    public static void main(String args[]) {

        //bruteforce method

        int a[] = {9,5,8,7};//input
        System.out.println("original array is");
        //display array
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("reverse array is");
        //reverse array
        for(int i=a.length-1;i>=0;i--){
            
            System.out.print(a[i]+" ");
        }
        
    }
    
}
