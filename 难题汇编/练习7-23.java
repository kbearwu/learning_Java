import java.util.Scanner;

public class ForthDay {
    static int[] arraySrchIdx(int[] a,int x) {
        int[] index = new int[a.length];
        for (int i = 0,n = 0; i < a.length; i++) {
            if (a[i] == x) {
                index[n] = i;
                n++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("数组的元素数量：");
        int num = stdIn.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < a.length; i++) {
            System.out.print("第" + (i + 1) + "个元素值：");
            a[i] = stdIn.nextInt();
        }
        System.out.print("要查找的值：");
        int value = stdIn.nextInt();
        int[] idx = arraySrchIdx(a,value);
        for (int i = 0; i < idx.length; i++) {
            if (idx[i] == 0 && idx[0] != 0)
                continue;
            else
                System.out.println(idx[i]);
        }
    }
}
