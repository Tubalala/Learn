package day02.day08;
/*
序列化和反序列化时需要实现Serializable接口
它会给这个类添加一个标记
当我们实现序列化和反序列化时就会检测这个类是否有这个标记
没有就会抛出NotSerializableException异常

static不属于对象不能被序列化
transient 瞬态关键字 不能被序列化
* */
import java.io.Serializable;

public class Person implements Serializable {
    //规定序列号，当类改变时反序列也会成功
    private static final long serialVersioUID = 1L;
    private String name;
    private Integer age;
//    private static Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
