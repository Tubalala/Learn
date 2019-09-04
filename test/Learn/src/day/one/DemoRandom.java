package day.one;
import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
    public static void main(String[] args){
        Random num = new Random();
        for (int i = 0; i < 3; i++) {
            int n = num.nextInt(10);
            System.out.println(n);
        }
        int n = 5;
        int result1 = num.nextInt(n)+1;//取1-n
        int result2 = num.nextInt(n+1);//取0-n+1
        guess();
        Scanner sc =new Scanner(System.in);
        Random r = new Random();
        int num2 = r.nextInt(101);
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入你猜的数："+"还有"+(10-i)+"次机会");
            int gu = sc.nextInt();
            if (gu == num2) {
                System.out.println("恭喜你猜对了");
                break;
            }
            if (gu < num2) {
                System.out.println("猜小了");
            }
            if (gu > num2) {
                System.out.println("猜大了");
            }
        }


    }
    public static void guess(){
        Scanner sc =new Scanner(System.in);
        Random r = new Random();
        int num = r.nextInt(101);
        while (true){
            int gu = sc.nextInt();
            if (gu == num) {
                System.out.println("恭喜你猜对了");
                break;
            }
            if (gu < num) {
                System.out.println("猜小了");
            }
            if (gu > num) {
                System.out.println("猜大了");
            }
        }

    }

}
