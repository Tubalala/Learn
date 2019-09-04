package day03.test01;

public class Demo08Person {
    private String name;

    @Override
    public String toString() {
        return "Demo08Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Demo08Person() {
    }

    public Demo08Person(String name) {
        this.name = name;
    }
}
