package day.four.test;

public class USER {
    public static void main(String[] args) {
        Computer a = new Computer();
        a.turn_on();
        //多态写法
        Usb mouse = new Mouse();
        ((Mouse) mouse).Mosue_turn_on();
        //正常写法
        Keyword keyword = new Keyword();
        keyword.Keyword_turn_on();

        ((Mouse) mouse).Mosue_turn_off();
        keyword.Keyword_turn_off();

        a.turn_off();
    }
}
