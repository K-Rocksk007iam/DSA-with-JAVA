public class StockBuyAndSell {

    public static int maxProfit(int[] a) {
        int maxProfit=0;
        int minSofar=a[0];
        for(int i=0;i<a.length;i++){
            minSofar=Math.min(minSofar, a[i]);
            int profit=a[i]-minSofar;
            maxProfit=Math.max(maxProfit, profit);

        }
        return maxProfit;
        
    }
    public static void main(String[] args) {
        int[] a={5,2,5,1};
        maxProfit(a);
        System.out.println(maxProfit(a));
        
    }
    
}
