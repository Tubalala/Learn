package day.two;

public class DemoStatic {
    private String name;
    private int age;
    private int id;
    static String room;
    static int idcounter = 0;
    static {
        System.out.println("静态方法执行！");
    }
    public void method(){
        System.out.println("这是一个成员方法！");

    }
    public static void method2(){
        System.out.println("这是一个静态方法！");
    }

    public DemoStatic(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idcounter;
    }

    public DemoStatic() {
        this.id = ++idcounter;
        System.out.println("构造方法执行！");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
