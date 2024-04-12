package org.example.aopYT.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Greeting {

    @Before("execution(public void school())")
    public void morningGreeting(){
        System.out.println("Good Morning ! ");
    }

    @After("execution(public void school())")
    public void EveningGreeting(){
        System.out.println("Good Morning ! ");
    }

}
