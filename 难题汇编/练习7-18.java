import java.util.Scanner;

public class Practice {

    static void aryRmv(int[] a,int idx) {
        for (;idx < a.length - 1;idx++)
            a[idx] = a[idx + 1];
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
        System.out.println("要删除第几个元素：");
        int idx = stdIn.nextInt() - 1;
        aryRmv(a,idx);
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
