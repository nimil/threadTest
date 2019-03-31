package xin.nimil.threadtest.annoations;

import org.springframework.context.annotation.Import;
import xin.nimil.threadtest.enablemoudle.HelloWorldImportSelector;
import xin.nimil.threadtest.enablemoudle.HwConfiguration;

import java.lang.annotation.*;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/31
 * @Time:19:12
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
//@Import(HwConfiguration.class)
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWorld {
}
