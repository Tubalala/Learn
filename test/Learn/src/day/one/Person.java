package day.one;
/*
标准类要包含有参和无参构造方法所有类成员为private
*/
public class Person {
    private String name;
    private int age;
    private boolean male;
    public Person(){
        System.out.println("无参构造方法！");
    }
    public Person(String name,int age,boolean male){
        this.name = name;
        this.age = age;
        this.male = male;
        System.out.println("有参构造方法！");
    }
    public void say(String name){
        System.out.println(name+" hello "+this.name);
        System.out.println(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
    public boolean isMale() {
        return male;
    }

    public void setAge(int age) {
        if (age>0 && age <100){
            this.age = age;
        }else {
            System.out.println("数据不合理！");
        }
    }
    public int getAge() {
        return age;
    }

}
