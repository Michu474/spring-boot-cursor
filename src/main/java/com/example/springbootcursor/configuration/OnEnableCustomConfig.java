package com.example.springbootcursor.configuration;

import com.example.springbootcursor.beanclasses.ConditionalBeanMessage;
import com.example.springbootcursor.conditions.ConfigurationEnabler;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConditionalOnClass(ConfigurationEnabler.class)
@PropertySource("classpath:application.properties")
public class OnEnableCustomConfig {

    @Bean
    @ConditionalOnProperty(name = "custom.configuration.enabled", havingValue = "true")
    ConditionalBeanMessage OkMessage() {
        return new ConditionalBeanMessage("Everything works!");
    }


}
