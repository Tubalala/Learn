package day03.cn.itcast.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {
    //使用junit进行测试

    /**
     * 初始化方法
     *
     */
    @Before
    public void init() {
        System.out.println("init...");
    }
    @After
    public void close(){
        System.out.println("close!!!");
    }
    /**
     * 测试方法add
     */
    @Test
    public void testAdd(){
        Calculator c = new Calculator();
//        调用add方法
        int result = c.add(2,4);
//        System.out.println(result);

        //断言 我断言的结果6
        Assert.assertEquals(6,result);
    }

    @Test
    public void testSub(){
        Calculator c = new Calculator();
        //调用add方法
        int result = c.sub(2,4);
//        System.out.println(result);

        //断言 我断言的结果6
        Assert.assertEquals(-2,result);
    }
}
