package day03.test01;

import java.util.stream.Stream;

/*concat用于把两个流结合到一起*/
public class Demo07 {
    public static void main(String[] args) {
        String[] str = {"张三","李四","王五","赵六","田七"};
        String[] str1 = {"三张","四李","五王","六赵","七田"};
        Stream<String> stream = Stream.of(str);
        Stream<String> stream1 = Stream.of(str1);
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(s -> System.out.print(s+" "));
    }
}
