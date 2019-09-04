package day.night;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<Integer> mapindex = new ArrayList<>();
        String[] colors = {"♠","♡","♧","♢"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        int index = 0;
        map.put(index,"大王");
        mapindex.add(index);
        index++;
        map.put(index,"小王");
        mapindex.add(index);
        for (String number :
                numbers) {
            for (String color :
                    colors) {
                index++;
                map.put(index, color + number);
                mapindex.add(index);
            }
        }
        Collections.shuffle(mapindex);
//        System.out.println(mapindex);
//        System.out.println(map);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        for (int i = 0; i < mapindex.size(); i++) {
            Integer in = mapindex.get(i);
            if (i >= 51) {
                list4.add(in);
            } else if (i % 3 == 0) {
                list1.add(in);
            }else if (i % 3 == 1) {
                list2.add(in);
            }else if (i % 3 == 2) {
                list3.add(in);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);
        Collections.sort(list3);
        Collections.sort(list4);

        show("张三",list1,map);
        show("李四",list2,map);
        show("王五",list3,map);
        show("底牌",list4,map);

    }

    private static void show(String name,ArrayList<Integer> index,HashMap<Integer,String> map) {
        System.out.print(name+":");
        int count = 0;
        for (Integer key : index) {
            String value = map.get(key);
            System.out.print(value+" ");
            count++;
        }
        System.out.print("共有"+count+"张");
        System.out.println();
    }
}
