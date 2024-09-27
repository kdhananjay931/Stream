import com.sun.source.tree.UsesTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class FindDuplicate {
    public static void main(String[] args) {

        List<String> str= Arrays.asList("pen","pen","pencil","book");

        Set<String> set = new HashSet<>();

        Set<String> collect = str.stream().filter(i ->!set.add(i)).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
