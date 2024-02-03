public class findMinMaxvalue {
    public static void main(String args[]) {
        int a[]= {20,10,45,2,65,78};
        int min = a[0];//both intialize at 0th index
        int max = a[0];

        for(int i=0;i<a.length;i++){//travrse to the last element
            if(a[i]<min){ //if min is greater therfore a[i] will be smaller ie, assign a[i] to min
                min=a[i];

            }
            if(a[i]>max){//if a[i] is greater therfore max will be smaller ie, assign max to a[i]
                max=a[i];
            }
            
        }
        System.out.print("minimum value is = "+ min+" "+"maximum value is = "+max);
        
    }
    
}
