package day03.test01;
import java.util.stream.Stream;

/*limit方法用于截取流中的元素
* 只能截取前n个
* 是个延迟方法
*
* skip方法
* 跳过前面n个元素然后截取元素*/
public class Demo06 {
    public static void main(String[] args) {
        String[] str = {"张三","李四","王五","赵六","田七"};
        Stream<String> stream = Stream.of(str);
        stream.limit(3).forEach((String s)-> System.out.println(s));
        System.out.println("=========");
        Stream<String> stream1 = Stream.of(str);
        stream1.skip(3).forEach(s -> System.out.println(s));
    }
}
