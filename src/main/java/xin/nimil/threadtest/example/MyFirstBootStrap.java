package xin.nimil.threadtest.example;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/17
 * @Time:10:59
 */
@ComponentScan("xin.nimil.threadtest.example.MyFirstRepository")
public class MyFirstBootStrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(MyFirstRepository.class).web(WebApplicationType.NONE).run(args);
        //检测bean是否存在
        MyFirstRepository myFirstRepository = context.getBeanFactory().getBean("myFirstRepo",MyFirstRepository.class);

        System.out.println("lalal"+myFirstRepository.toString());

        //test
        context.close();


    }
}
