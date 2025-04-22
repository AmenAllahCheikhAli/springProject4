package tn.esprit.arctic.first_project.Configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Component
@Aspect
@Slf4j
public class LoggingAspect {
    @Before("execution(* tn.esprit.arctic.first_project.services.impl.CommandeService.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }
    @After("execution(* tn.esprit.arctic.first_project.services.impl.CommandeService.*(..))")
    public void logMethodApres(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }
    @AfterThrowing("execution(* tn.esprit.arctic.first_project.services.impl.CommandeService.*(..))")
    public void logMethodExit(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }
    @AfterReturning("execution(* tn.esprit.arctic.first_project.services.impl.CommandeService.*(..))")
    public void logMethodReturning(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }

}