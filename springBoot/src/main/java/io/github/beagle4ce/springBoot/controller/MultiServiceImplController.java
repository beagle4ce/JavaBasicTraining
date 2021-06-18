package io.github.beagle4ce.springBoot.controller;

import io.github.beagle4ce.springBoot.service.strategy.StrategyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * MultiServiceImplController
 *
 * @author LLH
 * @since 六月/16/2021 星期三
 */
@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/multi/service")
public class MultiServiceImplController {
    
    @Resource(name = "bStrategyService")
    private StrategyService strategyService;
    
    /*@Resource(name = "bStrategyService")
    public void setStrategyService(StrategyService strategyService) {
        this.strategyService = strategyService;
    }*/
    
    @GetMapping(value = "/**")
    @ResponseBody
    public String test() {
        strategyService.executeStrategy();
        return "ok";
    }
    
    
}
