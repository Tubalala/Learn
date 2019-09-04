package cn.design_pattern.strategy;

/**
 * 策略者模式
 */
public class Strategy {
    /**
     * 操作接口
     */
    interface Operation{
        public int doOperation(int n,int m);
    }

    /**
     * 定义实现具体操作
     */
    class OperationAdd implements Operation{
        @Override
        public int doOperation(int n, int m) {
            return n + m;
        }
    }

    /**
     * 定义实现具体操作
     */
    class OperationSub implements Operation{
        @Override
        public int doOperation(int n, int m) {
            return n - m;
        }
    }

    /**
     * 计算器类
     */
    class Calculator{
        private Operation operation;

        public void setOperation(Operation operation) {
            this.operation = operation;
        }

        public int doOperation(int n,int m){
            return operation.doOperation(n,m);
        }
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        Strategy demo = new Strategy();
        Calculator calculator = demo.new Calculator();
        calculator.setOperation(demo.new OperationAdd());
        System.out.println(calculator.doOperation(1, 2));
    }
}
