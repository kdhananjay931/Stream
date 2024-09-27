import java.util.Arrays;

import java.util.stream.Collectors;

class Duplicatechar {
    public static void main(String[] args) {

        String input="Dhananjay";
        String output = Arrays.stream(input.split(""))
                .distinct()
                .collect(Collectors.joining());
        System.out.println(output);
    }




}
