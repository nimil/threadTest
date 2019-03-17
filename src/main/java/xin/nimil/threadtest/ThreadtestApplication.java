package xin.nimil.threadtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "xin.nimil.threadtest.web.servlet")
public class ThreadtestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThreadtestApplication.class, args);
    }
}
