package com.example.lombokfeatures.annotations;

import lombok.Getter;
import lombok.Setter;

/**
 * Demonstrates the usage of Lombok's @Getter and @Setter annotations.
 */
public class GetterSetterExample {

    // Lombok will automatically generate getter and setter methods for these fields
    @Getter
    @Setter
    private FullName name;

    @Getter
    @Setter
    private int age;

    private String password; // this not have Setter and Getter methods

    public static void main(String[] args) {
        // Create an instance of the class
        GetterSetterExample example = new GetterSetterExample();

        // Use Lombok-generated setter methods
        example.setAge(30);
        FullName name = new FullName();
        name.setFirstName("Jone");
        name.setLastName("Doe");
        example.setName(name);

        // Use Lombok-generated getter methods
        System.out.println("Name: " + example.getName().getFirstName()+" "+example.getName().getLastName());
        System.out.println("Age: " + example.getAge());
        // System.out.println("Password: "+ example.getPassword());
    }
}

/**
 * class level @Getter and @Setter
 */
@Setter
@Getter
class FullName{
    private String firstName;
    private String lastName;
}
