package io.github.beagle4ce.springBoot.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Map;

/**
 * JumpActionDto
 *
 * @author LLH
 * @since 五月/18/2021 星期二
 */
@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JumpActionDto {
    
    private String packages;
    
    private String activity;
    
    private String action;
    
    private String broadcast;
    
    private Map<String, Object> params;
}
