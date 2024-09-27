import java.util.stream.Collectors;
import java.util.stream.Stream;

class SumOfAllDigit {
    public static void main(String[] args) {

         int i=34567;

        Integer collect = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();

        System.out.println(collect);
    }
}
