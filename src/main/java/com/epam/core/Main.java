package com.epam.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring.xml");

        App app = (App)cxt.getBean("app");
        app.modifyLog("Some event for user 1");
    }
}
