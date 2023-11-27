package tn.esprit.examenblancspring.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LogginAspect {
    @After("execution(* tn.esprit.examenblancspring.service.*.add(..))")
    public void logmethodeandtry(JoinPoint joinPoint){
        String name=joinPoint.getSignature().getName();
        log.info("methode excute");
    }
    }

