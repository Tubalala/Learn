package cn.design_pattern.responsibility_list;

/**
 * 责任链模式
 */
public class ResponsibilityListDemo {
    /**
     * 责任链父类
     */
    abstract class IHandler{
        private IHandler successor;

        public void setSuccessor(IHandler successor) {
            this.successor = successor;
        }

        public abstract void handlerRequest(String post);

        protected final void next(String post){
            if(this.successor != null){
                this.successor.handlerRequest(post);
            }
        }
    }

    /**
     * 责任链对象A
     */
    class AHandler extends IHandler {

        @Override
        public void handlerRequest(String post) {
            res = post.replace("a", "*");

            System.out.println("方法A过滤a："+res);
            next(res);
        }

    }
    /**
     * 责任链对象B
     */
    class BHandler extends IHandler {
        @Override
        public void handlerRequest(String post) {
            res = post.replace("b","*");
            System.out.println("方法B过滤b："+res);
            next(res);
        }

    }
    /**
     * 责任链对象C
     */
    class CHandler extends IHandler {
        @Override
        public void handlerRequest(String post) {
            res = post.replace("c","*");
            System.out.println("方法C过滤c："+res);
            next(res);
        }

    }

    private static String res;
    public static void main(String[] args) {
        ResponsibilityListDemo demo = new ResponsibilityListDemo();
        AHandler aHander = demo.new AHandler();
        BHandler bHander = demo.new BHandler();
        CHandler cHander = demo.new CHandler();
        //建立责任链
        aHander.setSuccessor(bHander);
        bHander.setSuccessor(cHander);

        String post = "abc";
        System.out.println("过滤前："+post);
        aHander.handlerRequest(post);
        System.out.println("过滤后："+res);
    }

}
