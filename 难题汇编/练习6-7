import java.util.Random;
import java.util.Scanner;


class Practice6-7 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        final int n = 12;
        int[] a = new int[n];

        for (int j = 0;j < n;j++)
            a[j] = rand.nextInt(10);

        System.out.print("数组a中全部元素的值\n{ ");
        for (int j = 0; j < n; j++)
            System.out.print(a[j] + " ");
        System.out.println("}");

        System.out.println("要查找的数值：");
        int key = stdIn.nextInt();

        int i;
        for (i = a.length - 1; i > -1; i--)  //关键是这步，让i从最大值开始查找
            if (a[i] == key)
                break;
            if (i > -1)
                System.out.println("该元素是a[" + i + "].");
            else
                System.out.println("该元素不存在。");
            
    }
}
