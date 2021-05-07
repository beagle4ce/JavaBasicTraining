package io.github.beagle4ce.springBoot.controller;

import io.github.beagle4ce.springBoot.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TestController
 *
 * @author LLH
 * @since 四月/26/2021 星期一
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
    
    @Autowired
    private Employee employee;
    
    @GetMapping(value = "/path")
    @ResponseBody
    public String test() {
        return employee.getName();
    }
    
    @GetMapping(value = "/Objects")
    @ResponseBody
    public String test2() {
        return "path";
    }
}
