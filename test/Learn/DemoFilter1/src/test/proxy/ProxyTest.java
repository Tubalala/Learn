package test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        /**
         * 真实对象
         * 真实对象的所有接口
         * 代理器
         */
        SaleComputer proxy_lenovo = (SaleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * 代理逻辑编写的方法：代理对象使用的所有方法都会触发该方法执行
                     * @param proxy 代理对象
                     * @param method    代理对象调用的方法，被封装为对象
                     * @param args  代理对象调用的方法时，传递的实际参数
                     * @return
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println(proxy);
//                        System.out.println(method.getName());
//                        System.out.println(args[0]);
                        //增强参数
                        if (method.getName().equals("sale")) {
                            double money = (double) args[0];
                            money = money * 0.85;
                            System.out.println("接");
                            String obj = (String) method.invoke(lenovo, money);
                            System.out.println("送");
                            //增强返回值
                            return obj+"_鼠标垫";
                        }else {
                            Object obj = method.invoke(lenovo, args);
                            return obj;
                        }
                    }
                });
        String computer = proxy_lenovo.sale(8000);
        System.out.println(computer);
        proxy_lenovo.show();
    }
}
