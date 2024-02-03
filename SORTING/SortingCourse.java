public class BubbleSortCourse {
    //BUBBLE SORT 
    //TC = O(N^2)
/* 
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
   
    //SELECTION SORT
    //TC=O(N^2)


    private static void selectionSort(int num[]) {
        for(int i=0;i<num.length;i++){
            int minPos=i;
            for(int j=i+1;j<=num.length;j++){
                if(num[minPos]>num[i]){
                    minPos=j;
                }
            }
            int temp=num[minPos];
            num[minPos]=num[i];
            num[i]=temp;
        }
        
    }
    */ 
    //INSERTION SORT 
    //TC = O(N^2)

    public static void insertionSort(int num[]) {
        for(int i=1;i<num.length;i++){
                int current =num[i];
                int prev=num[i-1];

                while(prev>=0&&num[prev]>current){
                    num[prev+1]=num[prev];
                    prev--;
                }
                num[prev+1]=current;
        }
        
    }

    public static void printArray(int num[]) {
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        
    }

    public static void main(String[] args) {
        int num[]={3,4,1,6};
        insertionSort(num);
        printArray(num);
    

    }}
