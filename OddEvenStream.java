import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEvenStream {

    public static void main(String[] args) {


        List<Integer> int1= Arrays.asList(34,23,35,54,67,90);

       Map<Boolean, List<Integer>> collect = int1.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(collect);

         int1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}
