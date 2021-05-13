package io.github.beagle4ce.springBoot.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

/**
 * Consumer
 *
 * @author LLH
 * @since 四月/29/2021 星期四
 */
@Service
public class ConsumerService {
    
    @Getter
    @Setter
    private String name;
    
    public String getDetail(String input) {
        return input + "service";
    }
}
