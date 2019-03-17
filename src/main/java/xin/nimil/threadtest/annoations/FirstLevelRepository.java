package xin.nimil.threadtest.annoations;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/17
 * @Time:10:56
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {
     String value();
}
