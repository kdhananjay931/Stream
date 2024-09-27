package Revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumberStream {
    public static void main(String[] args) {


        List<Integer> int1 = Arrays.asList(23, 45, 12, 56, 23, 3, 48);
        Integer integer = int1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(integer);


    }

}
