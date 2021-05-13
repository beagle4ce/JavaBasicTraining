package io.github.beagle4ce.springBoot.controller;

import io.github.beagle4ce.springBoot.service.ConsumerService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.With;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TestController
 *
 * @author LLH
 * @since 四月/26/2021 星期一
 */
@Controller
@AllArgsConstructor
@With
@RequestMapping(value = "/test")
public class TestController {
    
    private final static String CONSTANTS = "Prefix ";
    
    private static String suffix;
    
    private String buttomInput;
    
    private final ConsumerService consumerService;
    
    @GetMapping(value = "/path/{input}")
    @ResponseBody
    public String test(@PathVariable(value = "input")String input) {
        consumerService.setName(input);
        return CONSTANTS + consumerService.getDetail(input);
    }
    
}
