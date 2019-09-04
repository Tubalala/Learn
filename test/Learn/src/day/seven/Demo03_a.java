package day.seven;

public class Demo03_a<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public Demo03_a() {
    }

    public Demo03_a(E name) {
        this.name = name;
    }
}
