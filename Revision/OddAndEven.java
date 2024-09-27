package Revision;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OddAndEven {
    public static void main(String[] args) {
        int[] num = {12, 34, 55, 56, 78};

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i] + " Even");
            } else {
                System.out.println(num[i] + " Odd");
            }

        }

    }
}

