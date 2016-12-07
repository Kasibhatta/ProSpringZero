/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krishna.prospring;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author krishna.kasibhatta
 */
@Service("messageRenderer")

public class StdOutMR implements MessageRenderer {

    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                    + StdOutMR.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Autowired
    public void setMessageProvider(MessageProvider provider) {
        System.out.println("Inside first profile");
        this.messageProvider = provider;
    }
}
