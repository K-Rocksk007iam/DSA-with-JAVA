public class PrintPairsInAnArray {

    private static void printPair(int number[]) {
        int total=0;
        for(int i=0;i<number.length;i++){
            
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+number[i]+","+number[j]+")");
                total++;
            }
            System.out.println();
        }
        System.out.println("total pairs are "+total);
        
    }

    public static void main(String[] args) {
        int number[]={1,5,3,6};
        printPair(number);
    }
    
}
