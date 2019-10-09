package cn.thread.publish;

import java.util.Arrays;

public class UnsafePublish {
    private String[] states = {"a","b","c"};
    public String[] getStates(){
        return states;
    }

    public static void main(String[] args) {
        UnsafePublish unsafePublish = new UnsafePublish();
        System.out.println(Arrays.toString(unsafePublish.getStates()));
        unsafePublish.getStates()[0] = "d";
        System.out.println(Arrays.toString(unsafePublish.getStates()));
    }
}
