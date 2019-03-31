package xin.nimil.threadtest.enablemoudle;

import org.springframework.context.annotation.Configuration;
import xin.nimil.threadtest.annoations.ConditionalSystemProperty;
import xin.nimil.threadtest.annoations.EnableHelloWorld;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/31
 * @Time:20:16
 */
@Configuration
@EnableHelloWorld //Spring模块装配
@ConditionalSystemProperty(name="user.name",value = "amin")
public class HelloWorldAutoConfigtation {
}
