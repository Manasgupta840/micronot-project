package com.practice.qualifier;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
public class MainApplication {

    private final Logger logger;

    //we can use @Named annotation or we can create our own annotation of Bean qualifiers

//    public MainApplication(@Named("console") Logger logger){
//        this.logger = logger;
//    }
//    public MainApplication(@Console Logger logger){
//        this.logger = logger;
//    }
    public MainApplication(Logger logger){
        this.logger = logger;
    }

    public void process(){
        System.out.println("processing");
        logger.log();
    }
}
