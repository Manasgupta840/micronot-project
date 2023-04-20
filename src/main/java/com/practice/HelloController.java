package com.practice;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloController {

    @Get("/hello")
    public String getGreeting(){
        return "Hello World";
    }
}
