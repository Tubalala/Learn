package cn.design_pattern.proxy;

/**
 * 静态代理
 */
public class StaticProxyDemo {
    /**
     * 方法接口
     */
    interface IMethod{
        void show(String str);
    }

    class MethodDemo implements IMethod{

        @Override
        public void show(String str) {
            System.out.println(str);
        }
    }

    /**
     * 代理方法
     */
    class ProxyMethod{
        private IMethod proxyMethod;

        public ProxyMethod() {
            this.proxyMethod = new MethodDemo();
        }

        /**
         * 对原有的方法进行增强
         * @param str
         */
        public void show(String str){
            if (str.equals("Hello world")) {
                proxyMethod.show(str);
            }else {
                proxyMethod.show("null");
            }
        }
    }
}
