package Revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MaxAndMin {
    public static void main(String[] args) {

        List<Integer> int1= Arrays.asList(23,45,67,12,83,10);

        int max=int1.stream().max(Comparator.naturalOrder()).get();
         int min=int1.stream().min(Comparator.naturalOrder()).get();

        System.out.println(max);
        System.out.println(min);
    }
}
