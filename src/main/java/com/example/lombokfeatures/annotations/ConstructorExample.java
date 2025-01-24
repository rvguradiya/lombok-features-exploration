package com.example.lombokfeatures.annotations;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Demonstrates the usage of Lombok's constructor annotations:
 * @NoArgsConstructor, @AllArgsConstructor, and @RequiredArgsConstructor.
 */
@ToString
/**
 * @NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
 * force: A field is final or has no default value, (force = true) will initialize such fields with their default values.
 * access: Changes the access modifier of the constructor, default is public
 */
@NoArgsConstructor(force = true)
/**
 * @AllArgsConstructor(access = AccessLevel.PROTECTED)
 */
@AllArgsConstructor
/**
 * @RequiredArgsConstructor(access = AccessLevel.PROTECTED)
 * all final field or @NotNull filed or both will be initialized
 */
@RequiredArgsConstructor
public class ConstructorExample {

    private final String requiredField;
    private String optionalField;
    private int numericField;

    public static void main(String[] args) {
        // Using @NoArgsConstructor to create an instance with no fields initialized
        ConstructorExample example1 = new ConstructorExample();
        System.out.println("NoArgsConstructor: " + example1);

        // Using @AllArgsConstructor to initialize all fields
        ConstructorExample example2 = new ConstructorExample("Required", "Optional", 42);
        System.out.println("AllArgsConstructor: " + example2);

        // Using @RequiredArgsConstructor to initialize only the required fields
        ConstructorExample example3 = new ConstructorExample("Required");
        System.out.println("RequiredArgsConstructor: " + example3);
    }
}
