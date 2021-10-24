package cn.itcast.reflect;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        // 可以创建任意对象
        // 1. 加载配置文件
        // 1.1 创建 properties
        Properties pro = new Properties();
        // 1.2 加载配置文件， 形成map集合
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        // 2. 获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        // 3. 加载该类进内存
        Class cls = Class.forName(className);
        // 4. 创建对象
        Object obj = cls.newInstance();
        // 5. 获方法对象
        Method method = cls.getMethod(methodName);
        // 6. 执行方法
        method.invoke(obj);


    }
}
