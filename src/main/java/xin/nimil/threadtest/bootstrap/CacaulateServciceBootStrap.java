package xin.nimil.threadtest.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import xin.nimil.threadtest.enablemoudle.EnableHelloWorldBootStrap;
import xin.nimil.threadtest.service.CalcuateService;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/31
 * @Time:19:42
 */
@SpringBootApplication(scanBasePackages = "xin.nimil.threadtest.service")
public class CacaulateServciceBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CacaulateServciceBootStrap.class)
                .web(WebApplicationType.NONE)
                .profiles("java8")
                .run(args);
        CalcuateService helloWorld = context.getBean(CalcuateService.class);

        System.out.println("helloWorld bean"+helloWorld.sum(1,2,3));
        context.close();
    }

}
