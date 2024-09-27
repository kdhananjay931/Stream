import java.util.Arrays;
import java.util.List;

class Multiple {
    public static void main(String[] args) {

        List<Integer>int1=Arrays.asList(24,25,30,36,35);
        int1.stream().filter(i ->i%5==0 ).forEach(System.out::println);

    }
}
