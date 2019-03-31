package xin.nimil.threadtest.annoations;

import org.springframework.context.annotation.Conditional;
import xin.nimil.threadtest.enablemoudle.OnSystemConditionProperties;

import java.lang.annotation.*;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/31
 * @Time:19:52
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
@Conditional(OnSystemConditionProperties.class)
public @interface ConditionalSystemProperty {
    /**
     * Java 系统属性的名称
     * @return
     */
    String name();

    /**
     * java系统属性值
     * @return
     */
    String value();
}
