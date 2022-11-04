package com.example.springbootcursor.configuration;

import com.example.springbootcursor.beanclasses.ConditionalBeanMessage;
import com.example.springbootcursor.conditions.ConfigurationEnabler;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//Custom configuration with conditions when properties don`t match
@Configuration
@ConditionalOnClass(ConfigurationEnabler.class)
@PropertySource("classpath:application.properties")  // That`s not necessary,it uses default property path but anyway
public class OnEnableAddCustomConfig {

    @Bean
    @ConditionalOnProperty(name = "custom.configuration.enabled",havingValue = "false")
    ConditionalBeanMessage OkMessage(){
        return new ConditionalBeanMessage("Something went wrong!");
    }


}
