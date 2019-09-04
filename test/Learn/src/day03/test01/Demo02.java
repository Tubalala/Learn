package day03.test01;

import java.util.*;
import java.util.stream.Stream;

public class Demo02 {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        Set<Object> set = map.keySet();
        Stream<Object> stream = set.stream();

        ArrayList<Integer> list = new ArrayList<>();
        Stream<Integer> stream1 = list.stream();

        Collection<Object> values = map.values();
        Stream<Object> stream2 = values.stream();

        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        Stream<Map.Entry<Object, Object>> stream3 = entries.stream();

        int[] arr = {1,2,3,4,5,6,7,8};
        Stream<int[]> stream4 = Stream.of(arr);


    }
}
