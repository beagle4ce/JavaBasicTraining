package io.github.beagle4ce.springBoot.service.strategy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * AStrategyService
 *
 * @author LLH
 * @since 六月/16/2021 星期三
 */
@Slf4j
@RequiredArgsConstructor
@Service(value = "bStrategyService")
public class BStrategyService implements StrategyService {
    
    @Override
    public void executeStrategy() {
        System.out.println("This is B strategy!");
    }
}
