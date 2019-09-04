package day.seven;

public class Demo03 {
    public static void main(String[] args) {
        Demo03_a<String> a = new Demo03_a<>();
        a.setName("abc");
        System.out.println(a.getName());
        Demo03_a<Integer> a1 = new Demo03_a<>();
        a1.setName(123);
        System.out.println(a1);
    }
}
