import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class  FrequencyOfCharacter {

    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day";

        Map<Character, Long> collect = inputString.chars().mapToObj(c ->(char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
