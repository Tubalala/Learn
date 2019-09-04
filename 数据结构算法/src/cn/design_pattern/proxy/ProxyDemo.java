package cn.design_pattern.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * 动态代理
 */
public class ProxyDemo {
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
    class MethodHandler implements InvocationHandler {
        //被代理目标
        private Object target;

        public Object newProxyInstance(Object target){
            this.target = target;
            //该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例
            //第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
            //第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的实现接口
            //第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
            //根据传入的目标返回一个代理对象
            return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                    target.getClass().getInterfaces(),this);
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (method.getName().equals("show")) {
                if (args[0].equals("Hello world")) {
                    method.invoke(target,args[0]);
                }else {
                    args[0] = "";
                    method.invoke(target,args[0]);
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        ProxyDemo demo = new ProxyDemo();
        MethodHandler handler = demo.new MethodHandler();
        IMethod proxy = (IMethod) handler.newProxyInstance(demo.new MethodDemo());
        proxy.show("Hello world");

    }
}
