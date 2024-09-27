import java.util.Arrays;

class SecondHighestNumberUsingArray {

    public static int secondHighest(int[]a,int total){

        Arrays.sort(a);
        return a[total-2];
    }

    public static void main(String[] args) {
        int[] a ={2,46,8,3,256};
        System.out.println(secondHighest(a,5));
    }


}
