package io.github.beagle4ce.springBoot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * LogAnnoHandle
 *
 * @author LLH
 * @since 六月/22/2021 星期二
 */
@Aspect
@Component
public class LogAnnoHandle {
    
    @Pointcut("@annotation(io.github.beagle4ce.springBoot.annotation.LogAnno)")
    public void logAnnoPointCut() {}
    
    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void requestMappingPointCut() {}
    
    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void getMappingPointCut() {}
    
    @Pointcut("@annotation(org.springframework.web.bind.annotation.PostMapping)")
    public void postMappingPointCut() {}
    
    @Pointcut("@annotation(org.springframework.web.bind.annotation.PutMapping)")
    public void putMappingPointCut() {}
    
    @Pointcut("@annotation(org.springframework.web.bind.annotation.DeleteMapping)")
    public void deleteMappingPointCut() {}
    
    @Before("requestMappingPointCut() " +
            "|| getMappingPointCut() " +
            "|| postMappingPointCut() " +
            "|| putMappingPointCut() " +
            "|| deleteMappingPointCut()")
    public void before(JoinPoint joinPoint) {
        for (Object obj : joinPoint.getArgs()) {
            System.out.println(obj);
        }
    }
}
