import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class RemoveDuplicate {

    public static void main(String[] args) {


       List<String> Duplicate = Arrays.asList("Java" ,"Python","Ruby","Java","Hindi","Hindi");

        List<String> collect = Duplicate.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);


    }
}