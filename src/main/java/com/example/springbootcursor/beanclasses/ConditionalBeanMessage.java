package com.example.springbootcursor.beanclasses;

public class ConditionalBeanMessage {
    private String message;

    public ConditionalBeanMessage(String message) {
        this.message=message;
    }

    public void sendMessage(){
        System.out.println(message);
    }
}
