import java.util.Random;
import java.util.Scanner;


class Practice6_10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("元素个数："); int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(10) + 1;
            if (i > 0 && a[i] == a[i-1])    //之前是这里没想通，只要加一个i > 0的条件就可以解决i没有-1的问题
                a[i] = rand.nextInt(10) + 1;
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }
}
