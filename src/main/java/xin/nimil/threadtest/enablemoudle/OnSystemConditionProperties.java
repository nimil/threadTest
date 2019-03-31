package xin.nimil.threadtest.enablemoudle;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import xin.nimil.threadtest.annoations.ConditionalSystemProperty;

import java.util.Map;
import java.util.Objects;

/**
 * 系统属性条件判断
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/31
 * @Time:19:54
 */
public class OnSystemConditionProperties implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Map<String, Object> annotationAttributes = annotatedTypeMetadata.getAnnotationAttributes(ConditionalSystemProperty.class.getName());

        Object name = annotationAttributes.get("name");
        String name1 = String.valueOf(name);
        String value = String.valueOf(annotatedTypeMetadata.getAnnotationAttributes("value"));
        String property = System.getProperty(name1);

//        return Objects.equals(property,value);
  return true;
    }
}
