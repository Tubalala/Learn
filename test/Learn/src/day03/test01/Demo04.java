package day03.test01;

import java.util.stream.Stream;
/*stream流中filter是对数据进行过滤
* predict中的抽象方法
* boolean test（T t）*/
public class Demo04 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        /*stream是管道流，使用完一次就不能继续调用方法
        * */
//        Stream<String> stream1 = stream.filter((String name) -> name.startsWith("张"));
//        stream1.forEach((String name)-> System.out.println(name));
        stream.filter(name->name.startsWith("张")).forEach(name-> System.out.println(name));

    }
}
