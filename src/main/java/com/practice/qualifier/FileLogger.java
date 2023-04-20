package com.practice.qualifier;

import io.micronaut.context.annotation.Primary;
import jakarta.inject.Singleton;

@Singleton
@Primary //treating it's as first priority when we will inject the Logger instance
public class FileLogger implements Logger{
    @Override
    public void log() {
        System.out.println("Logging the message to file");
    }
}
