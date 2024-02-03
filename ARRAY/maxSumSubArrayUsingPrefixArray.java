public class maxSumSubArrayUsingPrefixArray {
    //TC=O(n^2)

    private static void prefixArrayMaxsum(int num[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length]; //array declare
        prefix[0]=num[0];//sum of first element = that element

        //prefix array calculate
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }

        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                if(i==0){
                    currSum=prefix[j];
                }
                else{
                    
                currSum=prefix[j]+prefix[i-1];//sum of end element + start-1 of prefix array
                }
                if(maxSum<currSum){
                    maxSum=currSum;
                }


            }
        }
        System.out.println(maxSum);
        
    }

    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        prefixArrayMaxsum(num);
    }
    
}
