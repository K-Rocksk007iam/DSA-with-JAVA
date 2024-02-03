import java.util.*;
//incomplete
//kedanes algorithm
 class ContiguosSubArray {
    public static void main(String args[]) {
        int a[]={-2, -3, 4, -1, -2, 1, 5, -3};
        int currentsum=0;
        int maxsum=0;
        
         for(int i=0;i<a.length-1;i++){
      
            currentsum=currentsum+a[i];
            if(currentsum>maxsum){
                maxsum=currentsum;
            }
            if(currentsum<0){
                currentsum=0;
            }
            
           System.out.print(maxsum);
            
        }
        
        
        
    }
    
}
