package xin.nimil.threadtest.enablemoudle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/31
 * @Time:19:10
 */
@Configuration
public class HwConfiguration {

    @Bean
    public String helloWorld(){
        return "hello world 2019";
    }

}
