package cn.design_pattern.strategy;

/**
 * 减法
 */
public class Sub implements Operation{
    @Override
    public int doOperation(int n, int m) {
        return n - m;
    }
}
