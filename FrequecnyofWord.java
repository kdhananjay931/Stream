import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class FrequecnyofWord {

    public static void main(String[] args) {


        List<String> str = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        Map<String, Long> collected = str.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collected);
    }


}