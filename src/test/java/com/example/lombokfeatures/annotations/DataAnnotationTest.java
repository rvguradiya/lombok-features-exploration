package com.example.lombokfeatures.annotations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the DataAnnotationExample class to validate Lombok-generated methods.
 */
public class DataAnnotationTest {

    @Test
    public void testGetterSetter() {
        DataAnnotationExample example = new DataAnnotationExample("12345");

        // Test Lombok-generated setters
        example.setName("John Doe");
        example.setAge(30);

        // Test Lombok-generated getters
        assertEquals("John Doe", example.getName());
        assertEquals(30, example.getAge());
    }

    @Test
    public void testToString() {
        DataAnnotationExample example = new DataAnnotationExample("12345");
        example.setName("John Doe");
        example.setAge(30);

        // Test Lombok-generated toString
        String expected = "DataAnnotationExample(id=12345, name=John Doe, age=30)";
        assertEquals(expected, example.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        DataAnnotationExample example1 = new DataAnnotationExample("12345");
        example1.setName("John Doe");
        example1.setAge(30);

        DataAnnotationExample example2 = new DataAnnotationExample("12345");
        example2.setName("John Doe");
        example2.setAge(30);

        // Test Lombok-generated equals
        assertEquals(example1, example2);

        // Test Lombok-generated hashCode
        assertEquals(example1.hashCode(), example2.hashCode());
    }
}
