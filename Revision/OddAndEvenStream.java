package Revision;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddAndEvenStream {
    public static void main(String[] args) {

        List<Integer> lst= Arrays.asList(12,34,21,45,44);

        List<Integer> even=lst.stream().filter(i->i%2!=0).collect(Collectors.toList());

        System.out.println(even);

    }
}
