package day.four.test;

public interface Usb {
    public default void turn_on(){
        System.out.println("USB连接打开!");
    }
    public default void turn_off(){
        System.out.println("USB连接关闭!");
    }
}
