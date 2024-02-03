public class toUpperCase {
    //tc=O(n)

    public static String convertToUpperCase(String str) {

        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));//first character uppercase 
        sb.append(ch);//adding to the stringBuilder
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&&i<str.length()-1){//empty space
                sb.append(str.charAt(i));//adding empty space
                i++;//the next character of empty space
                sb.append(Character.toUpperCase(str.charAt(i)));//making it uppercase
            }
            else{
                sb.append(str.charAt(i));//remaining added to the stringbuilder
            }
        }
        return sb.toString();//converting stringbuilder to string

        
    }
    public static void main(String[] args) {
        String str="hello my name is kunal suryawanshi";
        System.out.println(convertToUpperCase(str));
    }
    
}
