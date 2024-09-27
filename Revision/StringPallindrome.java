package Revision;

import java.util.Locale;

public class StringPallindrome {
    public static void main(String[] args) {

        String str="Dhana";
        str=str.toLowerCase();
         String rev="";

        for (int i = str.length()-1; i>=0; i--) {
            rev=rev + str.charAt(i);
        }if(str.equals(rev)){
            System.out.println("pallindrom");
        }else {
            System.out.println("Not pallindrom");
        }
    }


}
