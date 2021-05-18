package io.github.beagle4ce.springBoot.controller;

import io.github.beagle4ce.springBoot.dto.JumpActionDto;
import io.github.beagle4ce.springBoot.service.ConsumerService;
import lombok.AllArgsConstructor;
import lombok.With;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * TestController
 *
 * @author LLH
 * @since 四月/26/2021 星期一
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
    
    
    @GetMapping(value = "/path/{input}")
    @ResponseBody
    public JumpActionDto test(@PathVariable(value = "input")String input) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", "abcdefg");
        map.put("backUrl", "http://192.168.1.1:8080/abc/def/ghi/jkl");
        return JumpActionDto.builder()
                .packages("com.amt.message")
                .activity("AppRunner")
                .action("click")
                .broadcast("all")
                .params(map)
                .build();
    }
    
}
