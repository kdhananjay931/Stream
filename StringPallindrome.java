public class StringPallindrome {
    public static void main(String[] args) {

        String str="abba";
        str=str.toLowerCase();
         String rev="";

        for (int i = str.length()-1; i>=0; i--) {
            rev=rev + str.charAt(i);
        }if(str.equals(rev)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }


}
