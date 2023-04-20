package com.practice.qualifier;

import io.micronaut.context.annotation.Secondary;
import jakarta.inject.Singleton;

@Singleton
@Secondary
public class ConsoleLogger implements Logger{
    @Override
    public void log() {
        System.out.println("Logging to console");
    }
}
