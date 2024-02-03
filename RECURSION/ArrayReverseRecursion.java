public class ArrayReverseRecursion {
    public static int reverseArray(int a[],int i) {
        if(i>a.length/2){
            return 0;
        }
        int temp=a[i];
        a[i]=a[a.length-i-1];
        a[a.length-i-1]=temp;
        reverseArray(a,i+1);
        return a;
        
    }
   
    

   

    public static void main(String args[]) {
        int a[]={8,7,9,5,4};
        reverseArray(a,0);
        
        
        
    }
    
}
