import java.util.Scanner;

public class way {
    static Scanner stdIn = new Scanner(System.in);

    static int readPlusInt() {      
        int n;
        do {
            System.out.println("正整数值：");
            n = stdIn.nextInt();
        }
        while (n <= 0);
        return n;
    }
    public static void main(String[] args) {
        int a = readPlusInt();
        System.out.print(a);
    }
}
