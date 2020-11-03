import java.util.Scanner;
import java.util.Random;

public class Practice6_18 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        System.out.print("输入行数："); int h = stdIn.nextInt();

        int [][] c;
        c = new int[h][];
        for (int i = 0; i < c.length; i ++) {
            System.out.print("输入各行列数：");
            int w = stdIn.nextInt();
            c[i] = new int[w];
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j ++) {
                c[i][j] = rand.nextInt(10);
                System.out.printf("%3d", c[i][j]); }
            System.out.println();
        }

    }
}
