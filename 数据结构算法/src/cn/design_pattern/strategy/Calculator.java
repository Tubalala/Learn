package cn.design_pattern.strategy;

/**
 * 计算器类
 * 策略者模式
 */
public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int doOperation(int n,int m){
        return operation.doOperation(n,m);
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setOperation(new Sub());
        System.out.println(calculator.doOperation(1, 3));
    }
}
