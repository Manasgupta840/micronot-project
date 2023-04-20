package com.practice.qualifier;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@MicronautTest
class MainApplicationTest {

    @Inject
    private MainApplication mainApplication;

    @Test
    void shouldLogToFile(){
        mainApplication.process();
    }
}
