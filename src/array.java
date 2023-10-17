import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
//        System.out.println(size);
        int number[]= new int[size];

        for (int i=0;i<size;i++)
        {
            number[i]=in.nextInt();

        }

        for (int i=0;i<size;i++)
        {
            System.out.println(number[i]);
        }

    }
}
