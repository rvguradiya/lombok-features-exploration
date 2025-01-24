package com.example.lombokfeatures.annotations;

import lombok.Value;

/**
 * Demonstrates the usage of Lombok`s @Value annotation.
 * The @Value annotation makes the class immutable by:
 * - Making all fields private and final
 * - Generating getters for all fields
 * - Creating a parameterized constructor
 * - Generating equals(), hashCode(), and toString() methods
 */
@Value
public class ValueAnnotationExample {

    String id;
    String name;
    int age;

    public static void main(String[] args) {
        // Using @Value to create an immutable object
        ValueAnnotationExample example = new ValueAnnotationExample("12345", "Jane Doe", 30);

        // Lombok-generated toString() method
        System.out.println("Object details: " + example);

        // Lombok-generated getters
        System.out.println("ID: " + example.getId());
        System.out.println("Name: " + example.getName());
        System.out.println("Age: " + example.getAge());

        // Attempting to modify fields will result in an error since the object is immutable
        // example.name = "New Name"; // Uncommenting this line will cause a compilation error
    }
}

