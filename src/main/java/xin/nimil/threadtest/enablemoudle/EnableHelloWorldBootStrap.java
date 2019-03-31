package xin.nimil.threadtest.enablemoudle;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import xin.nimil.threadtest.annoations.EnableHelloWorld;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/31
 * @Time:19:15
 */
@EnableHelloWorld
public class EnableHelloWorldBootStrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld = context.getBean("helloWorld", String.class);

        System.out.println("helloWorld bean"+helloWorld);
        context.close();
    }
}
