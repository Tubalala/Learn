package cn.design_pattern.single;

/**
 * 单例模式
 */
public class SingleObject {
    /**
     * 懒汉式 延迟加载 当使用到时才会创建实例
     */
    static class LazySingleObject{

        private static LazySingleObject instance = null;

        private LazySingleObject() {
        }

        public static synchronized LazySingleObject getInstance() {
            if (instance == null) {
                instance = new LazySingleObject();
            }
            return instance;
        }
    }

    /**
     * 双重检查加锁
     */
    static class CheckedSingleObject{
        private volatile static CheckedSingleObject instance = null;

        private CheckedSingleObject() {
        }

        public static CheckedSingleObject getInstance() {
            if (instance == null) {
                synchronized (CheckedSingleObject.class){
                    if (instance == null) {
                        instance = new CheckedSingleObject();
                    }
                }
            }
            return instance;
        }
    }

    /**
     * 饿汉式
     */
    static class HungrySingleObject{
        private static HungrySingleObject instance = new HungrySingleObject();

        private HungrySingleObject() {
        }

        public static HungrySingleObject getInstance() {
            return instance;
        }
    }

    /**
     * 静态内部类
     */
    static class InnerSingleObject{
        static class InSingleObject{
            private static InnerSingleObject instance = new InnerSingleObject();
        }

        public static InnerSingleObject getInstance() {
            return InSingleObject.instance;
        }
    }
}
