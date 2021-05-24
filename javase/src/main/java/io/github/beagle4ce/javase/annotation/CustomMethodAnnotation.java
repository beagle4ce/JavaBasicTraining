package io.github.beagle4ce.javase.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: Beagle
 * @since: 五月/22/2021 星期六
 */
@Target(ElementType.METHOD) // 声明这个注解使用于哪个地方
@Retention(RetentionPolicy.RUNTIME) // 标明这个注解在哪里可用
public @interface CustomMethodAnnotation { // 这是一个自定义方法注解

    int number() default 0; // 定义了一个参数，且设定参数默认值是0
}
