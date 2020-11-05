import java.util.Scanner;

class Chapter4 {
    static int[] arrayClone(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length;i++) {
            b[i] = a[i];
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("数组a元素个数：");
        int num = stdIn.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++)
            a[i] = i;
        int[] x = arrayClone(a);  //复制a
        for (int i = 0; i < a.length; i++)
            System.out.println(x[i]);
    }
}

/*之前的错误是在第17行后直接arrayClone(a)，但实际上要先定义x，且需要遍历数组a去复制*/
