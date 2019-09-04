package day03.test02;
/*通过类名引用静态成员方法
* 类已经存在，静态成员方法也已经存在
* 就可以通过类名直接引用成员方法*/
public class Demo03 {
    public static int method(int num,Calcable c){
        return Math.abs(num);
    }

    public static void main(String[] args) {
        int num = method(-10, s -> Math.abs(s));
        System.out.println(num);
        //简化lambda
        int num1 = method(-10, Math::abs);
        System.out.println(num1);
    }
}
