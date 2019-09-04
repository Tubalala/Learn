package cn.design_pattern.strategy;

/**
 * 加法
 */
public class Add implements Operation{
    @Override
    public int doOperation(int n, int m) {
        return n + m;
    }
}
