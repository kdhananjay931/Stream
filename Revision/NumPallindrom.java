package Revision;

public class NumPallindrom {
    public static void main(String[] args) {


        int i = 123;

        int r = 0;
        int sum=0;
        int temp=i;

        while(i>0) {
            r=i%10;
            sum=(sum*10)+r;
            i=i/10;

        }if(temp==sum)
        {
            System.out.println("pallindrom");
        }else {
            System.out.println("Not Pallindrom");
        }
    }
}