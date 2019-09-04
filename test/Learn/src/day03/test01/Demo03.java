package day03.test01;

import java.util.stream.Stream;

/*stream流中的常见方法
* foreach方法是一个终结方法，
* 遍历后就不能继续使用stream中的其他方法*/
public class Demo03 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        stream.forEach((String name)-> System.out.println(name));

    }

}
