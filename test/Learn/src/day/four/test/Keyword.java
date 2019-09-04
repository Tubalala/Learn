package day.four.test;

public class Keyword implements Usb{
    public void Keyword_turn_on() {
        System.out.println("键盘打开！");
        turn_on();
    }
    public void Keyword_turn_off() {
        System.out.println("键盘关闭！");
        turn_off();
    }
}
