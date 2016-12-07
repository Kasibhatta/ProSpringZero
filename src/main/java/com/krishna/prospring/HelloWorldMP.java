/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krishna.prospring;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author krishna.kasibhatta
 */
@Service("messageProvider")
public class HelloWorldMP implements MessageProvider {
    
    private String message;
   
    private int msgNumber;
    @Autowired
    public HelloWorldMP(Integer value){
        this.message="The Number is: " + (value+msgNumber) + " // Krishna //";
    }
    
    
    public HelloWorldMP(String value){
        this.message= message + value;
    }
    
    @Override
    public String getMessage() {
        return message;
    }
}
