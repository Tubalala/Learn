package cn.design_pattern.single;
//枚举实现单例
public class SingletonEnum {
    private SingletonEnum() {
    }
    public static SingletonEnum getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;

        private SingletonEnum singleton;

        //JVM保证构造方法只被调用一次
        Singleton() {
            singleton = new SingletonEnum();
        }

        public SingletonEnum getInstance() {
            return singleton;
        }
    }
}
