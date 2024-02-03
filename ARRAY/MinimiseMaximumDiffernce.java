import java.util.Arrays;
import java.util.*;
//incomplete VIMP

public class MinimiseMaximumDiffernce {
    
    static int getDiffernce(int a[],int k){
        Arrays.sort(a);
        int ans=a[a.length-1]-a[0];
        int smallest=a[0]+k;
        int largest=a[a.length-1]-k;
        int min=Math.min(smallest,a[i+1]-k);
        int max=Math.max(largest,a[i]+k);
        if(min<0){
            continue;
            ans=math.min(ans,max-min);
        }
        return ans;

    }
    public static void main(String args[]) {
        int a[]={1,5,15,10};
        int k=3;
        int b=(a,a.length,k);
        System.out.print(b);
        int ans, smallest, largest;


        
    }
    
    
}
