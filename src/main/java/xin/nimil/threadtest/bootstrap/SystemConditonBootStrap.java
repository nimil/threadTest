package xin.nimil.threadtest.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import xin.nimil.threadtest.annoations.ConditionalSystemProperty;
import xin.nimil.threadtest.service.CalcuateService;

/**
 *
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/31
 * @Time:19:58
 */
@ConditionalSystemProperty(name="user.name",value = "amin")
public class SystemConditonBootStrap {

    @Bean
    @ConditionalSystemProperty(name="user.name",value = "amin")
    public String helloWorld1(){
        return "Hello,World amin";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SystemConditonBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld1 = context.getBean("helloWorld1", String.class);
        System.out.println(helloWorld1);
        context.close();
    }

}
