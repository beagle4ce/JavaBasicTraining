package me.beagle4ce.training.mybatis_plus_training.configs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "me.beagle4ce.training.**.mappers")
public class MybatisPlusConfig {
}
