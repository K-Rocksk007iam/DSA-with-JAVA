public class MaxSumOfSubArray {
    //bruteforce
    //TC=O(n^3)

    private static void maxSumSubArray(int number[]) {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                currentSum=0;
                for(int k=i;k<=j;k++){
                    currentSum+=number[k];
                }
                if(maxSum<currentSum){
                    maxSum=currentSum;
                }
               
            }
        }
        System.out.println(maxSum);

        
    }

    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        maxSumSubArray(number);
    }
    
}
