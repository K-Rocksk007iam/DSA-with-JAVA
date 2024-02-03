public class BubbleSortCourse {

    public static void bubbleSort(int num[]) {
        for(int i=0;i<num.length-1;i++){
            
            for(int j=0;j<num.length-1-i;j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                    
                }
        
            }
        }
        
    }

    public static void printArray(int num[]) {
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        
    }

    public static void main(String[] args) {
        int num[]={3,4,1,6,2,9,7,5};
        bubbleSort(num);
        printArray(num);
    

    }}
