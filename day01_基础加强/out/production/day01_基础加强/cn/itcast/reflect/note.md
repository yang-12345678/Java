## 反射：框架设计的灵魂
* 框架：半成品软件。可以在框架的基础上进行软件开发，简化编码

* 反射：将类的各个组成部分封装为其他对象，这就是反射机制

* 好处：
  1. 可以在程序运行过程中，操作这些对象
  2. 可以解耦，提高程序的扩展性
    
* 获取class对象的方式：
  1. Class.forName("全类名"):将字节码加载进内存，返回class对象
     * 多用于配置文件，将类名定义在配置文件中。读取文件，加载类
      
  2. 类名.class:通过类名的属性class获取
     * 多用于参数的传递
     
  3. 对象.getClass():getClass()方法在object类中定义着。 
     * 多用于对象的获取字节码的方式
    
* 结论：  
      同一个字节码文件(*.class)在一次程序运行过程中，只会被加载一次，无论通过哪一种方式获取的Class对象都是同一个
  
* Class对象功能：
    * 获取功能：
      1. 获取成员变量们
         * Field[] getFields(): 获取所有 public 修饰的成员变量
         * Field getField(String name): 获取指定名称的 public 修饰的成员变量 
         * Field[] declaredFields(): 获取所有的成员变量, 不考虑修饰符
         * Field[] getDeclaredField(String name): 获取指定名称的成员变量
      2. 获取构造方法们
      3. 获取成员方法们
      4. 获取类名
    
* Field：成员变量
    * 操作：
      1. 设置值
         * void set(Object obj, Object value)
      2. 获取值
         * get(Object obj)
      3. 忽略访问权限修饰符的安全检查
         * setAccessible(true)
