package com.example.lombokfeatures.annotations;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * Demonstrates the usage of Lombok's @Builder annotation.
 * The @Builder annotation helps implement the Builder pattern to simplify Immutable object creation.
 */
@Builder
@ToString
@Getter
public class BuilderExample {

    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public static void main(String[] args) {
        // Using @Builder to create an object
        BuilderExample person = BuilderExample.builder()
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .email("john.doe@example.com")
                .build();

        // Print the object using Lombok-generated toString method
        System.out.println("Created Person: " + person);
    }
}
