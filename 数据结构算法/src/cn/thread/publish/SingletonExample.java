package cn.thread.publish;

public class SingletonExample {
    public static class SingletonExample1{
        //私有构造函数
        private SingletonExample1() {
        }
        //单例对象
        private static SingletonExample1 instance = null;
        //静态工厂方法
        public static SingletonExample1 getInstance(){
            if (instance == null) {
                instance = new SingletonExample1();
            }
            return instance;
        }
    }
    public static class SingletonExample2{
        //私有构造函数
        private SingletonExample2() {
        }
        //单例对象
        private static SingletonExample2 instance = null;
        //静态工厂方法
        public static synchronized SingletonExample2 getInstance(){
            if (instance == null) {
                instance = new SingletonExample2();
            }
            return instance;
        }
    }
    public static class SingletonExample3{
        //私有构造函数
        private SingletonExample3() {
        }
        //单例对象
        private static SingletonExample3 instance = null;
        //静态工厂方法
        public static SingletonExample3 getInstance(){
            if (instance == null) {
                synchronized (SingletonExample3.class){
                    if (instance == null) {
                        instance = new SingletonExample3();
                    }
                }
            }
            return instance;
        }
    }
    public static class SingletonExample4{
        //私有构造函数
        private SingletonExample4() {
        }
        //单例对象
        private static volatile SingletonExample4 instance = null;
        //静态工厂方法
        public static SingletonExample4 getInstance(){
            if (instance == null) {
                synchronized (SingletonExample4.class){
                    if (instance == null) {
                        instance = new SingletonExample4();
                    }
                }
            }
            return instance;
        }
    }
}
