package day.one;

public class Phone {
    String name;
    double price;
    String color;
    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
    public void send(){
        System.out.println("群发短信");
    }

}
