/**
 * 
 */
package com.car.utils.annotation.mybatis;

import java.lang.annotation.*;

import org.springframework.stereotype.Component;

/**
 * @author Gaohongming
 * 创建时间：2017年2月12日 下午7:46:20 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Component
public @interface MyBatisScan {
    String value() default "";
}
