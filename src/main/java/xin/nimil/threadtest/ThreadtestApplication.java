package xin.nimil.threadtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import xin.nimil.threadtest.annoations.EnableHelloWorld;

@SpringBootApplication
@ServletComponentScan(basePackages = "xin.nimil.threadtest.web.servlet")
@EnableHelloWorld
public class ThreadtestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThreadtestApplication.class, args);
    }
}
