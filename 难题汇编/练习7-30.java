import java.util.Scanner;

public class Practice {
    static int min(int a, int b) {
        return a < b ? a : b;
    }
    static int min(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }
    static int min(int[] a) {
        int min = a[0];
        for(int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("a的值："); int a = stdIn.nextInt();
        System.out.print("b的值："); int b = stdIn.nextInt();
        System.out.print("c的值："); int c = stdIn.nextInt();

        System.out.print("数组元素个数："); int num = stdIn.nextInt();
        int[] x = new int[num];
        for (int i = 0; i < x.length; i++) {
            System.out.print("第" + (i + 1) + "个元素值：");
            x[i] = stdIn.nextInt();
        }

        System.out.println("两个数中的最小值为：" + min(a,b));
        System.out.println("三个数中的最小值为：" + min(a,b,c));
        System.out.println("数组中的最小值为：" + min(x));
    }
}
