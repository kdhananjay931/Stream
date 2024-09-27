import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class AddsuffixPrefix {

    public static void main(String[] args) {

        List<String> str= Arrays.asList("Pen","pencil","kites","Kerosine");

        String collect = str.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(collect);
    }
}
