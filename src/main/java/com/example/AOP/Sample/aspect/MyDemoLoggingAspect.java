package com.example.AOP.Sample.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    //this is where we add all of our related advices for logging

    // let's start with an @Before advice
    @Before("execution(public void com.example.AOP.Sample.dao.AccountDAO.addAccount())")//pointcut expression(execution point cut)
    public void beforeAddAccountAdviceMatchOnly(){
        System.out.println("\n=====>>> Executing @Before advice on addAccount(new match only AccountDAO addAccount)");
    }
    @Before("execution(public void addAccount())")//pointcut expression(execution point cut)
    public void beforeAddAccountAdvice(){
        System.out.println("\n=====>>> Executing @Before advice on addAccount");
    }

    @Before("execution(public void updateAccount())")//pointcut expression(execution point cut)
    public void beforeUpdateAccountAdvice(){
        System.out.println("\n=====>>> Executing @Before advice on updateAccount");
    }
   //public is a modifier and it is optional
    @Before("execution(public void add*())")//pointcut expression(execution point cut)
    public void beforeAddAccountAdviceForAnyMethodADD(){
        System.out.println("\n=====>>> Executing @Before advice on method ADD+Wildcard");
    }

    @Before("execution(boolean delete*())")//pointcut expression(execution point cut)
    public void beforeAddAccountAdviceForSpecificReturnType(){
        System.out.println("\n=====>>> Executing @Before advice on method ADD specific return type method");
    }
}
