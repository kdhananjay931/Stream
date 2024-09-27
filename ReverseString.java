import java.util.Arrays;
import java.util.stream.Collectors;

class ReverseString {
    public static void main(String[] args) {
        String str="India is my country";

        String string = new StringBuilder(Arrays.toString(str.split("\\."))).reverse().toString();
        System.out.println(string);
    }



}
