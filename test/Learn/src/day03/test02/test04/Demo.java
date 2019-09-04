package day03.test02.test04;

public class Demo {
    public static int[] builder(int length,ArrayBuilder ab){
        int[] ints = ab.builderArray(length);
        return ints;
    }

    public static void main(String[] args) {
        int[] builder = builder(10, s -> new int[s]);
        int[] builder1 = builder(10, int[]::new);
        System.out.println(builder.length);
        System.out.println(builder1.length);
    }
}
