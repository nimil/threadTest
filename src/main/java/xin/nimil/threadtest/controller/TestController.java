package xin.nimil.threadtest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/13
 * @Time:22:07
 */
@Slf4j
@RestController
public class TestController {

    @RequestMapping("test")
    public String testh(){
        log.info("request");
        return "Hello world";
    }

}
