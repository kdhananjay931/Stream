import java.util.Arrays;
import java.util.stream.Collectors;

class SeparateWithDot {


        public static void main(String[] args) {
            String input = "India is my country";

            // Split the input string by spaces
            String[] words = input.split(" ");

            // Join the words using dots
            String result = String.join(" ", words);

           // System.out.println(result);
            System.out.println(Arrays.toString(words));
        }
    }


