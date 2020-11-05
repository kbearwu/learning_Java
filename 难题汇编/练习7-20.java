import java.util.Scanner;

public class Practice {
    static void arrIns(int[] a, int idx, int x) {
        for (int i = a.length-1; i > idx; i--) {
            a[i] = a[i-1];
        }
        a[idx] = x;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        do {
            System.out.print("数组元素个数:");
            n = stdIn.nextInt();
        }
        while (n < 1);
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("第" + (i + 1) + "个元素的值：");
            a[i] = stdIn.nextInt();
        }
        System.out.print("插入到的位置： ");
        int idx = stdIn.nextInt() - 1;
        System.out.print("插入的值： ");
        int x = stdIn.nextInt();
        arrIns(a,idx,x);
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}
