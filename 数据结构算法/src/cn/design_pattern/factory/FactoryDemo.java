package cn.design_pattern.factory;

/**
 * 工厂模式
 */
public class FactoryDemo {
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
     * 工厂
     */
    static class Factory{
        Product produce(String type){
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
        private Factory factory;
        public Store(Factory factory) {
            this.factory = factory;
        }
        public Product create(String type){
            return factory.produce(type);
        }
    }

    public static void main(String[] args) {
        FactoryDemo demo = new FactoryDemo();
        Store store = demo.new Store(new Factory());
        Product a = store.create("A");
        a.show();
    }

}
