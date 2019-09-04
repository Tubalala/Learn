package day.night.DemoMap;

public class Demo03Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Demo03Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Demo03Person() {
    }

    public Demo03Person(String name, int age) {
        this.name = name;
        this.age = age;
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
