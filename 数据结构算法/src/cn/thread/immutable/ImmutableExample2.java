package cn.thread.immutable;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ImmutableExample2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);
        List<Integer> unmodifiableList = Collections.unmodifiableList(list);
        Collections.binarySearch(list,1);
        System.out.println(unmodifiableList);
    }
}
