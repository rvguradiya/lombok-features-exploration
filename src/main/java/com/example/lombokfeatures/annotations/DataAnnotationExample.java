package com.example.lombokfeatures.annotations;

import lombok.Data;
import lombok.ToString;

/**
 * Demonstrates the usage of Lombok's @Data annotation.
 * The @Data annotation combines @Getter, @Setter, @ToString, @EqualsAndHashCode, and @RequiredArgsConstructor.
 */
@Data
public class DataAnnotationExample {

    private final String id;
    private String name;
    private int age;

    public static void main(String[] args) {
        // Using @Data to generate boilerplate code
        DataAnnotationExample example = new DataAnnotationExample("12345");

        // Lombok-generated setter methods
        example.setName("John Doe");
        example.setAge(25);

        // Lombok-generated toString() method
        System.out.println("Object details: " + example);

        // Lombok-generated equals() and hashCode() methods
        DataAnnotationExample anotherExample = new DataAnnotationExample("12345");
        anotherExample.setName("John Doe");
        anotherExample.setAge(25);

        System.out.println("Objects are equal: " + example.equals(anotherExample));
    }
}
