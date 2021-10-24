package cn.itcast.Annotation;

/*
 * 元注解：用于描述注解的注解
 * @Target：描述注解能够作用的位置
 * @Retention：描述注解被保留的阶段
 * @Document: 描述注解是否被抽取到api文档中
 * @Inherited: 描述注解是否被子类继承
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE})  // 表示该注解只能作用于类上
public @interface MyAnno3 {
}
