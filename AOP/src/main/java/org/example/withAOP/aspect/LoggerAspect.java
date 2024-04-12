package org.example.withAOP.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LoggerAspect {

    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());
//    @Around("execution(* org.example.withAOP.beans.*.*(..))")

//    @Around("execution(public String carBody(org.example.withAOP.domain.Song))")
//    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
//        logger.info(joinPoint.getSignature().toString() + " method execution start");
//        Instant start = Instant.now();
//        joinPoint.proceed();
//        Instant finish = Instant.now();
//        long timeElapsed = Duration.between(start, finish).toMillis();
//        logger.info("Time took to execute the method : "+timeElapsed);
//        logger.info(joinPoint.getSignature().toString() + " method execution end");
//    }

    @Before("execution(public String carBody(org.example.withAOP.domain.Song))") // Corrected pointcut with closing parenthesis
    public void log(){
        System.out.println("Hello world");
    }


}
