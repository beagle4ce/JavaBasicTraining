package io.github.beagle4ce.springBoot.controller;

import io.github.beagle4ce.springBoot.annotation.LogAnno;
import io.github.beagle4ce.springBoot.service.strategy.StrategyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * TestController
 *
 * @author LLH
 * @since 四月/26/2021 星期一
 */
@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/test")
public class TestController {
    
    @Resource(name = "bStrategyService")
    private StrategyService strategyService;
    
    @GetMapping(value = "/**")
    @ResponseBody
    public String test() {
        return "ok";
    }
    
    @GetMapping(value = "/aspect")
    @ResponseBody
    public String aspectTest(@RequestParam("input")String inputStr) {
        log.info("=== " + inputStr);
        return inputStr;
    }
    
}
