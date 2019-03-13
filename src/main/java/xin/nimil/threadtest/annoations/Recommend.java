package xin.nimil.threadtest.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 安全的
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/13
 * @Time:21:55
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface Recommend {
    String value() default "";
}
