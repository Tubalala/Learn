package cn.designPattern.templateMethod;

/**
 * 模版方法
 */
public class TemplateMethodDemo {
    abstract class TemplateMethod{
        //钩子的开关
        boolean needBeforeDo = true;

        /**
         * 钩子
         */
        abstract void beforeDo();

        void start(){
            System.out.println("开始工作...");
        }

        /**
         * 期望子类实现的方法
         */
        abstract void toDo();

        void end(){
            System.out.println("结束工作...");
        }

        /**
         * 默认实现流程
         */
        public final void methodDo(){
            if (needBeforeDo) {
                beforeDo();
            }
            this.start();
            this.toDo();
            this.end();
        }
    }
    class Method extends TemplateMethod{
        /**
         * 通过构造方法 决定模板方法的钩子是否开启
         * @param needBeforeDo
         */
        public Method(boolean needBeforeDo) {
            super.needBeforeDo = needBeforeDo;
        }

        /**
         * 钩子
         */
        @Override
        void beforeDo() {

        }

        /**
         * 具体实现的方法
         */
        @Override
        void toDo() {

        }
    }
}
