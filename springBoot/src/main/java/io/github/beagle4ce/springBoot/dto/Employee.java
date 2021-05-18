package io.github.beagle4ce.springBoot.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * Employee
 *
 * @author LLH
 * @since 四月/26/2021 星期一
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@SuperBuilder(toBuilder = true)
public class Employee {
    
    private String name;
    
    private boolean gender;
    
    private int age;
    
}
