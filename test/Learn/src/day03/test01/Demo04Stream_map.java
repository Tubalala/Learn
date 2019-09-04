package day03.test01;

import java.util.stream.Stream;
/*stream map方法
* 映射 对数据类型进行转换*/
public class Demo04Stream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        Stream<Integer> stream1 = stream.map((String s) -> Integer.parseInt(s));
        stream1.forEach(num-> System.out.print(num+" "));
    }
}
