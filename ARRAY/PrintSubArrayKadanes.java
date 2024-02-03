public class PrintSubArrayKadanes {

    private static void kadanes(int num[]) {
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;

        for(int i=0;i<num.length;i++){
            currentSum+=num[i];

            if(currentSum<0){
                currentSum=0;
            }
            maxSum=Math.max(currentSum, maxSum); 
        }
        System.out.println(maxSum);
        
        
    }

    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
    }
    
}
