import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Pattern {
    public static void main(String[] args) {

        int row=5;

        IntStream.range(1,row).mapToObj(i->" ".repeat(row-i)+"*".repeat(2*i-1))
                .toList()
                .forEach(System.out::println);
    }
}
