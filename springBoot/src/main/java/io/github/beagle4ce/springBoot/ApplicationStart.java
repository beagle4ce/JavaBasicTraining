package io.github.beagle4ce.springBoot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.servlet.Servlet;

/**
 * ApplicationStart
 *
 * @author LLH
 * @since 四月/26/2021 星期一
 */
@Slf4j
@EnableAspectJAutoProxy
@SpringBootApplication
public class ApplicationStart implements ApplicationRunner {
    
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
    
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("=== Started finished ! ===");
    }
    
}
