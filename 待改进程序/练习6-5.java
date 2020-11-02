import java.util.Scanner;


class Practice6_5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("元素个数：");
        int num = stdIn.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = stdIn.nextInt();
            System.out.println("a[" + i + "]=" + a[i]);
        }
        System.out.print("a = {");        //从这开始感觉有点累赘，还需要对最后一个数做判断来取舍逗号问题
        for (int i = 0; i < num; i++) {
            if (i + 1 >= num){
            System.out.print(a[i]);}
            else {
                System.out.print(a[i] + ",");
            }

        }
        System.out.print("}");   //应有结果： a = {x,y,z,...}
    }
}
