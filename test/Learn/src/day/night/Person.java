package day.night;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
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

    @Override
    public int compareTo(Person o) {
//        return 0;//认为元素都是相同的
        //重写compare的规则
        //自定义规则
//        return this.getAge() - o.getAge();//升序
        return o.getAge() - this.getAge();//降序

    }
}
