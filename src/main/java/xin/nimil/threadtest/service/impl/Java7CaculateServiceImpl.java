package xin.nimil.threadtest.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import xin.nimil.threadtest.service.CalcuateService;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/31
 * @Time:19:39
 */
@Profile("java7")
@Service
public class Java7CaculateServiceImpl implements CalcuateService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println("java7");
        int sum = 0;
        for (int i = 0;i<values.length;i++){
            sum+=values[i];
        }
        return sum;
    }

}
