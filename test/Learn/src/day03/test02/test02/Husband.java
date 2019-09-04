package day03.test02.test02;
/*通过this引用本类的成员方法*/
public class Husband {
    public void buyHouse(){
        System.out.println("买房子！");
    }

    public void marry(Richable r){
        r.buy();
    }

    public void soHappy(){
        marry(()->{
            this.buyHouse();
        });

        //lambda简化
        marry(()->this.buyHouse());
    }

    public static void main(String[] args) {
        new Husband().soHappy();
    }
}
