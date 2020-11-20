package me.beagle4ce.training.mybatis_plus_training.configs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemConfig {

    @Getter
    @Setter
    @Value("${param.test}")
    private String[] params;
}
