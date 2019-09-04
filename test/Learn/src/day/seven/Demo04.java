package day.seven;
//创建含有泛型的方法
public class Demo04 {
    public static void main(String[] args) {
        Demo04method a = new Demo04method();
        a.methoda(3);
        a.methoda("abc");
        a.methoda(8.8);
        a.methoda(true);
        Demo04method.methodb(3);
        Demo04method.methodb(8.8);
        Demo04method.methodb(true);
        Demo04method.methodb("abc");
    }
}
