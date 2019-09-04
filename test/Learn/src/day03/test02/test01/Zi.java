package day03.test02.test01;
/*子类
* */
public class Zi extends Human{
    @Override
    public void sayHello() {
        System.out.println("hello 我是子类！");
    }
    //传递方法参数Greetable接口
    public void method(Greater g){
        g.greet();
    }
    public void show(){
       /* method(()->{
            Human human = new Human();
            human.sayHello();
        });*/
       /*使用super引用类的成员方法
       * super是已经存在的
       * 父类的成员方法也是已经存在的
       * 所以可以直接使用super引用父类的成员方法*/
       //优化后
        method(()->super.sayHello());
    }

    public static void main(String[] args) {
        new Zi().show();
    }
}
