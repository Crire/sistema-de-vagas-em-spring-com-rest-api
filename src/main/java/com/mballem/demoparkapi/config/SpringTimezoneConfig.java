package com.mballem.demoparkapi.config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.TimeZone;

@Configuration
public class SpringTimezoneConfig {

    //Essa anotacao vai fazer com que, apos o projeto spring
    //for inicializado, e apos o construtor for inicializado,
    //a primeira coisa a ser executada sera o elemento com
    //o @PostConstruct
    @PostConstruct
    public void timezoneConfig(){
        TimeZone.setDefault(TimeZone.getTimeZone("America/Manaus"));
    }
}
