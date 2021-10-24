package cn.itcast.Annotation;

public @interface MyAnno {

    int value();
//    String name() default "yang";
    Person per();
    MyAnno2 anno();
    String[] strs();
//    String show();
}
