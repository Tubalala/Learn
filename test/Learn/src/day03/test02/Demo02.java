package day03.test02;
/*通过对象名引用成员方法
* 使用前提是对象名已存在，成员方法也存在
* 就可以使用成员名引用成员方法*/
public class Demo02 {
    public static void print(Printable p){
        p.print("hello world");
    }

    public static void main(String[] args) {
        print(s -> {
            Demo02MethodRerObject obj = new Demo02MethodRerObject();
            obj.printUpperCase(s);
        });
        /*使用方法优化lambda*/
        print(s -> {
            Demo02MethodRerObject obj = new Demo02MethodRerObject();
            print(obj::printUpperCase);
        });


    }
}
