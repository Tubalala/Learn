package day.four;

public class User {
    private int num;
    private String name;

    public User(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public User() {
    }

    public void show(){
        System.out.println("姓名："+name+"，余额："+num);
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
