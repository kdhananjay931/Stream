package Revision;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateWord {
    public static void main(String[] args) {


        List<String> str = Arrays.asList("Pen", "pencil", "NoteBook", "Pen");
        Set<String> set = new HashSet<>();

        Set<String> collect = str.stream().filter(i -> !set.add(i)).collect(Collectors.toSet());
        System.out.println(collect);
    }
}