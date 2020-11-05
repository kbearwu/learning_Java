//在练习7-18基础上改进

import java.util.Scanner;

public class way {

    static void aryRmv(int[] a,int idx,int n) {
        for (;idx < a.length - n;idx++)   //-1改成-n
            a[idx] = a[idx + n];
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
        System.out.print("要删除第几个元素：");
        int idx = stdIn.nextInt() - 1;
        System.out.print("要删除几个元素：");  //新增
        int num = stdIn.nextInt();
        aryRmv(a,idx,num);
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
