public class OddOrEven {

    public static void oddOrEven(int n) {
        if((n&1)==0){
            System.out.println("number id even");
        }
        else{
            System.out.println("number id odd");
        }
        
    }
    public static void main(String[] args) {
        int n;
        oddOrEven(4);
    }
    
}
