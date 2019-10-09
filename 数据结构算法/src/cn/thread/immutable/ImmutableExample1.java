package cn.thread.immutable;


import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;


import java.util.Map;

public class ImmutableExample1 {
    private final static Map<Integer,Integer> map = Maps.newHashMap();
    static {
        map.put(1,2);
        map.put(2,3);
        map.put(3,2);
        map.put(4,2);
    }

    public static void main(String[] args) {
        ImmutableExample1 example1 = new ImmutableExample1();
        map.put(1,3);
        System.out.println(map.get(1));

        ImmutableList<Integer> immutableList1 =  ImmutableList.<Integer>builder().add(1,2,3,4).build();
        ImmutableList<Integer> immutableList2 =  ImmutableList.of(1,2,3,4);

        ImmutableSet<Integer> immutableSet = ImmutableSet.copyOf(immutableList2);

        ImmutableMap<Integer, Integer> immutableMap1 = ImmutableMap.of(1, 1, 2, 2, 3, 3, 4, 4);
        ImmutableMap<Integer, Integer> immutableMap2 = ImmutableMap.<Integer,Integer>builder().put(1, 1).put(2, 2).build();
    }
}
