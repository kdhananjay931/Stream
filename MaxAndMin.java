import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class MaxAndMin {
    public static void main(String[] args) {


        List<Integer> int2 = Arrays.asList(5, 7, 33, 55, 66, 77, 1, 3, 98);
        int max = int2.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);

        int min=int2.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);


    }
}