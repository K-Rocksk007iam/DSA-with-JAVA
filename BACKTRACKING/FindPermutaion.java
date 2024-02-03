public class FindPermutaion {

    public static void permutaions(String str, String Ans ) {
        //base case
        if(str.length()==0){
            System.out.println(Ans);
            return;
        }
        //backtracking
        for(int i=0;i<str.length();i++){
           char current= str.charAt(i);
           String NewStr=str.substring(0, i)+str.substring(i+1);
           permutaions(NewStr, Ans+current); 
        }
        
    }
    public static void main(String[] args) {
        String str ="abc";
        permutaions(str, "");
        
    }
    
}
