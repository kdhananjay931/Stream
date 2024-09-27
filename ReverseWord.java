import java.util.Arrays;
import java.util.stream.Collectors;

class ReverseWord {

    public static void main(String[] args) {

        String str="India is my Country";


        String str1= Arrays.stream(str.split(" "))
                .map(i -> new StringBuffer(i).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(str1);



    }


}
