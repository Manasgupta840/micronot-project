package com.practice.lifecycle;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
class PersonTest {

    @Inject
    private Person person;

    @Test
    void shouldInitializePerson(){
        Assertions.assertEquals("Elon Musk", person.getName());
    }
}
