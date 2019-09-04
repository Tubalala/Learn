package cn.design_pattern.factory;

/**
 * 抽象工厂模式
 */
public class AbstractFactoryDemo {
    /**
     * 商品类
     */
    static class Product{
        void show(){};
    }
    /**
     * 商品A
     */
    static class ProductA extends Product{
        @Override
        public void show(){
            System.out.println("this is productA...");
        }
    }
    /**
     * 商品B
     */
    static class ProductB extends Product{
        @Override
        public void show(){
            System.out.println("this is productB...");
        }
    }

    /**
     * 抽象工厂
     */
    static abstract class AbstractFactory{
        abstract Product produce(String type);
    }
    /**
     * 工厂A
     */
    static class FactoryA extends AbstractFactory{
        Product produce(String type){
            System.out.print("FactoryA: ");
            if (type.equalsIgnoreCase("A")) {
                return new ProductA();
            } else if (type.equalsIgnoreCase("B")) {
                return new ProductB();
            }
            return null;
        }
    }
    /**
     * 工厂B
     */
    static class FactoryB extends AbstractFactory{
        Product produce(String type){
            System.out.print("FactoryB: ");
            if (type.equalsIgnoreCase("A")) {
                return new ProductA();
            } else if (type.equalsIgnoreCase("B")) {
                return new ProductB();
            }
            return null;
        }
    }

    /**
     * 工厂提供者
     */
    class Store{
        private AbstractFactory factory;
        public Store(AbstractFactory factory) {
            this.factory = factory;
        }
        public Product create(String type){
            return factory.produce(type);
        }
    }

    public static void main(String[] args) {
        AbstractFactoryDemo demo = new AbstractFactoryDemo();
        Store store = demo.new Store(new FactoryA());
        Product a = store.create("A");
        a.show();
    }

}
