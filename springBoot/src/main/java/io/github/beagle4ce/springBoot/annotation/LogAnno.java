package io.github.beagle4ce.springBoot.annotation;

import java.lang.annotation.*;

/**
 * LogAnno
 *
 * @author LLH
 * @since 六月/22/2021 星期二
 */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnno {
}
