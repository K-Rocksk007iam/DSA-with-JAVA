public class FindSubset {

    public static void findSubset(String str,String answer,int i) {
        if(i == str.length()){
            System.out.println(answer);
            return;
        }

        findSubset(str, answer+str.charAt(i), i+1);

        findSubset(str, answer, i+1);
        
    }
    public static void main(String[] args) {
        String str="abc";
        findSubset(str, "", 0);
        
        
    }
    
}
