package cn.itcast.Annotation;

/**
 *     * @Override：检测被该注解标注的方法是否是继承父类(接口)的
 *     * @Deprecated：将该注解标注的内容，表示已过时
 *     * @SupperessWarnings：压制警告
 */
@SuppressWarnings("all")
public class AnnotationDemo2 {

    @Override
    public String toString() {
        return "AnnotationDemo2{}";
    }

    @Deprecated
    public void show1() {
        // 有缺陷
    }

//    @SuppressWarnings("all")
//    @MyAnno
    public void show2() {
        // 替代show1方法
    }

    public void demo() {
        show1();  // 有横线，不影响使用
    }
}
