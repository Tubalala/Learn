package day.three;

public class DemoMath {
    public static void main(String[] args) {
        int [] array = {-5,8,9,10,3,5,4};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (Math.abs(array[j]) >= Math.abs(array[j + 1])) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
        int count = 0;
        System.out.println();
        for (int i = -10; i < 7; i++) {
            if (Math.abs(i) >= 2 && Math.abs(i) <= 6) {
                System.out.print(i+",");
                count++;
            }
        }
        System.out.println("\n共有："+count+"个");
    }
}
