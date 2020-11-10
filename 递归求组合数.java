import java.util.Scanner;

class Practice {

    static long C(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * C(n - 1);
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("输入n:");
        int n = stdIn.nextInt();
        System.out.print("输入k:");
        int k = stdIn.nextInt();
        System.out.print("C（" + n + "，" + k + "）的值为：" + C(n) / (C(k) * C(n - k)));

    }
}
