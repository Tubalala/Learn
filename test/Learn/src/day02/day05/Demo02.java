package day02.day05;

public class Demo02 {
    public static void main(String[] args) {
        int count = count(5);
        System.out.println(count);
    }

    private static int count(int n) {
        if (n == 1) {
            return 1;
        }
        return n * count(n-1);
    }
}
