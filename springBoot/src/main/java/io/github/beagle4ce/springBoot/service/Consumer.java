package io.github.beagle4ce.springBoot.service;

import io.github.beagle4ce.springBoot.dto.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Consumer
 *
 * @author LLH
 * @since 四月/29/2021 星期四
 */
@Service
public class Consumer {
    
    @Bean
    public Employee employee() {
        return new Employee();
    }
}
