public class PrintSubArray {

    public static void printSubarray(int num[]) {
        int totalSubArray=0;
        
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]);
                    
                }
                totalSubArray++;
                System.out.println();
            }
           
        }
        System.out.println("total="+totalSubArray);
       
        
    }
    public static void main(String[] args) {
        int num[]={1,2,3};
        printSubarray(num);
    }
    
}
