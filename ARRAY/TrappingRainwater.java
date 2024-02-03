import java.util.*;
public class TrappingRainwater {

    private static void trappingRainWater(int height[]) {
        int n=height.length;

        //calculate left max boundary
        int leftMaxBoundary[] = new int[height.length];
        leftMaxBoundary[0]=height[0]; 

        for(int i=1;i<n;i++){
            leftMaxBoundary[i]=Math.max(height[i], leftMaxBoundary[i-1]);

        }

        //calculate right max boundary(ie. from last index)
        int rightMaxBoundary[]=new int[height.length];
        rightMaxBoundary[n-1]=height[n-1];
        
        for(int i=n-2;i>=0;i--){
            rightMaxBoundary[i]=Math.max(height[i], rightMaxBoundary[i+1]);
        }

        //calculate trapped water and water level
        int trappedWater=0;
        int width=1;
        int waterLevel=0;

        for(int i=0;i<n;i++){
            //water level
            waterLevel=Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);

            //trapped water
            trappedWater+=waterLevel-height[i]*width;
        }
        System.out.println(trappedWater);
        
        
    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        trappingRainWater(height);
    }
    
}
