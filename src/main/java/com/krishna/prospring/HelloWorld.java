/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. Modded the comment
 */
package com.krishna.prospring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author krishna.kasibhatta
 */
public class HelloWorld {
    public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext
    ("app-context-example1.xml");
    MessageRenderer mr = ctx.getBean("messageRenderer", MessageRenderer.class);
    mr.render();
    }
    
}
