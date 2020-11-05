import java.util.Scanner;

class Chapter7 {
    static Scanner stdIn = new Scanner(System.in);

    static void aryExchng(int[] a, int[] b) {
        int ln;
        if (a.length > b.length)
            ln = b.length;
        else
            ln = a.length;
        for (int i = 0; i < ln; i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }
    }

    static void aryInp(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print("第" + (i + 1) + "元素值:");
            a[i] =stdIn.nextInt();
        }
    }

    public static void main(String[] args) {
        System.out.print("a的元素个数：");
        int num_a = stdIn.nextInt();
        int[] a = new int[num_a];
        aryInp(a);

        System.out.print("b的元素个数：");
        int num_b = stdIn.nextInt();
        int[] b = new int[num_b];
        aryInp(b);

        aryExchng(a,b);
        System.out.println("数组a。");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);

        System.out.println("数组b。");
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);
    }
}
