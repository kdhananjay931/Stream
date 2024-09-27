import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SecondHighestNumberCollection {

    public static int secondHighest(Integer[]a, int total){
        List<Integer> list=Arrays.asList(a);
        Collections.sort(list);
      int ele=list.get(total-2);
        return ele;



    }

    public static void main(String[] args) {
        Integer a[]={2,46,8,3,256};
        System.out.println(secondHighest(a,5));
    }


}
