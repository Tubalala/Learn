package day.eleven;

public class Fu {
    public void show01() throws NullPointerException,ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04(){}

}
class Zi extends Fu{
    //子类重写抛出父类相同异常
    @Override
    public void show01() throws NullPointerException, ClassCastException {
        super.show01();
    }
    //抛出父类异常的子类
    @Override
    public void show02() throws ArrayIndexOutOfBoundsException {
        super.show02();
    }
    //子类不抛出异常
    @Override
    public void show03() {
        super.show03();
    }

    @Override
    public void show04() throws IndexOutOfBoundsException{
        super.show04();
    }
}
