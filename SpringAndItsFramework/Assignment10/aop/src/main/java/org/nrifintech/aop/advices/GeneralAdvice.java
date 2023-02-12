package org.nrifintech.aop.advices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GeneralAdvice {

    @Before(value = "execution(* org.nrifintech.aop.models.Student.avgMarks())")
    public void beforeAdvice(JoinPoint jp) {
        System.out.println("Advice before");
        System.out.println();
    }

    @After("execution(* org.nrifintech.aop.models.Student.showMarks())")
    public void afterAdvice(JoinPoint jp) {
        System.out.println();
        System.out.println("Advice after");
    }
}
