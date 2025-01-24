package com.example.lombokfeatures.annotations;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Demonstrates the usage of Lombok's @ToString and @EqualsAndHashCode annotations.
 */
@ToString
@EqualsAndHashCode
public class ToStringEqualsHashCodeExample {

    private String firstName;
    private String lastName;
    private int age;

    public ToStringEqualsHashCodeExample(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {
        ToStringEqualsHashCodeExample person1 = new ToStringEqualsHashCodeExample("John", "Doe", 30);
        ToStringEqualsHashCodeExample person2 = new ToStringEqualsHashCodeExample("Jane", "Doe", 25);
        ToStringEqualsHashCodeExample person3 = new ToStringEqualsHashCodeExample("John", "Doe", 30);

        // Demonstrate toString()
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);

        // Demonstrate equals()
        System.out.println("Person 1 equals Person 2: " + person1.equals(person2));
        System.out.println("Person 1 equals Person 3: " + person1.equals(person3));

        // Demonstrate hashCode()
        System.out.println("Person 1 hashCode: " + person1.hashCode());
        System.out.println("Person 3 hashCode: " + person3.hashCode());
    }
}
