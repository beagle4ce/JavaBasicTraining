package io.github.beagle4ce.springBoot.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * SystemConfig
 *
 * @author LLH
 * @since 五月/24/2021 星期一
 */
@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "system")
public class SystemConfig {
    // 组合的成员对象同样会被映射进来,很方便
    private ProjectConfig project;
}
