package xin.nimil.threadtest.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import xin.nimil.threadtest.service.CalcuateService;

import java.util.stream.Stream;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/31
 * @Time:19:39
 */
@Profile("java8")
@Service
public class Java8CaculateServiceImpl implements CalcuateService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println("java8");
        return Stream.of(values).reduce(0,Integer::sum);
    }

}
