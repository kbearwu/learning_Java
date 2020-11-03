import java.util.Random;
import java.util.Scanner;

class Practice6_13 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("元素个数：");
        int n = stdIn.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]=");
            a[i] = stdIn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = a[n-i-1];

        }
        System.out.println("复制完毕");

        for (int i = 0; i < n; i++)
            System.out.println("b[" + i + "]=" + b[i]);
    }
}
