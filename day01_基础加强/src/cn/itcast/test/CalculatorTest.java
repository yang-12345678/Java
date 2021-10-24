package cn.itcast.test;


import cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void init() {
        System.out.println("init.....");
        // 初始化方法
        // 用于资源申请，所有测试方法在执行之前都会执行该方法
    }

    @After
    public void close() {
        // 释放资源方法
        // 在所有测试方法执行完毕后，都会自动执行该方法
        System.out.println("close....");
    }

    /**
     * 测试 add 方法
     */
    @Test
    public void testadd() {
        Calculator c = new Calculator();
        int a = c.add(1, 2);
//        System.out.println(a);

        // 3.断言，我断言这个结果是 3
        Assert.assertEquals(3, a);
    }


}
