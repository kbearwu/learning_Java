import java.util.Scanner;
import java.util.Random;

public class ForthDay {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("元素个数：");
        int n = stdIn.nextInt();
        int [] a = new int[n];
        int max = a[0];

        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(10) + 1;
        }

        for (int i = 0;i < n; i++) {
            if ( a[i] >= max )
                    max = a[i];
        }

        for (int j = 0; j < max;j++) {
            for (int i = 0; i < n; i++) {
                if ( a[i] < max - j )
                        System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++)
            System.out.print("--");
            System.out.println();
            for (int i = 0; i < n;i++)
                System.out.print(i % 10 + " ");
    }

}
