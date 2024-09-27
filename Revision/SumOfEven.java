package Revision;

import java.util.Arrays;
import java.util.List;

public class SumOfEven {

    public static void main(String[] args) {

        List<Integer>  int1=Arrays.asList(1,3,2,4,5,6,7,8,9,10) ;


        int sum = int1.stream().filter(i -> i % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}