public class ArrangeNegPos {
    public static void main(String args[] ) {
        int a[]={-2,-1,-3,-5,6,3,2,1,0};
        int temp;
        for(int i=0;i<a.length-1;i++ ){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(a[i]<a[i+1]){
                System.out.print(a[i]+" ");

            }
        }
        
    }
    
}
