package com.example.lombokfeatures.annotations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the BuilderExample class to validate the Lombok-generated builder functionality.
 */
public class BuilderAnnotationTest {

    @Test
    public void testBuilderCreatesCorrectObject() {
        // Use Lombok-generated builder to create an object
        BuilderExample person = BuilderExample.builder()
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .email("john.doe@example.com")
                .build();

        // Validate the object's fields
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals(30, person.getAge());
        assertEquals("john.doe@example.com", person.getEmail());
    }

    @Test
    public void testBuilderToString() {
        // Create an object using the builder
        BuilderExample person = BuilderExample.builder()
                .firstName("Jane")
                .lastName("Doe")
                .age(25)
                .email("jane.doe@example.com")
                .build();

        // Test Lombok-generated toString method
        String expectedToString = "BuilderExample(firstName=Jane, lastName=Doe, age=25, email=jane.doe@example.com)";
        assertEquals(expectedToString, person.toString());
    }
}
