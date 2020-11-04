import java.util.Random;
import java.util.Scanner;

class Practice {

    //生成随机数
    static int random(int a, int b) {
        Random rand = new Random();
        int num;
        if (b <= a)
            return a;
        else {
            num = rand.nextInt(b - a) + a;
            return num; }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数a:"); int a = stdIn.nextInt();
        System.out.print("整数b:"); int b = stdIn.nextInt();

        System.out.println("随机数：" + random(a,b));
    }
}
