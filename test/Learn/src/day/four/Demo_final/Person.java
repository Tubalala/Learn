package day.four.Demo_final;

public class Person {
   private String name;
    final private int num;//必须保证所有重载的构造方法必须有对其进行赋值

    public int getNum() {
        return num;
    }
    //不存在set重新赋值
//    public void setNum(int num) {
//        this.num = num;
//    }

    public Person(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public Person(String name) {
        this.name = name;
        num = 10;
    }

    public Person() {
        num = 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
