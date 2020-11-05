//改成了两位数随机加减法运算

import java.util.Random;
import java.util.Scanner;

class Practice {
    static Scanner stdIn = new Scanner(System.in);

    static boolean confirmRetry() {
        int cont;
        do {
            System.out.print("再来一次？<Yes-1  No-0>:");
            cont = stdIn.nextInt();
        }
        while (cont != 0 && cont != 1);
        return cont == 1;

    }

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("心算能力训练。");
        do {
            int x = rand.nextInt(90) + 10;
            int y = rand.nextInt(90) + 10;
            int z = rand.nextInt(90) + 10;
            int a = rand.nextInt(4);
            switch (a) {
                case 0:
                    while (true) {
                        System.out.print(x + "+" + y + "+" + z + "=");
                        int k = stdIn.nextInt();
                        if (k == (x + y + z))
                            break;
                        System.out.println("回答错误！");
                    }
                    break;
                case 1:
                    while (true) {
                        System.out.print(x + "+" + y + "-" + z + "=");
                        int k = stdIn.nextInt();
                        if (k == (x + y - z))
                            break;
                        System.out.println("回答错误！");
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.print(x + "-" + y + "+" + z + "=");
                        int k = stdIn.nextInt();
                        if (k == (x - y + z))
                            break;
                        System.out.println("回答错误！");
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.print(x + "-" + y + "-" + z + "=");
                        int k = stdIn.nextInt();
                        if (k == (x - y - z))
                            break;
                        System.out.println("回答错误！");
                    }
                    break;
            }
        }
        while (confirmRetry());
    }
}
