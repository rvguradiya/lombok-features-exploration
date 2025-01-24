package com.example.lombokfeatures.annotations;

import lombok.experimental.SuperBuilder;

/**
 * Demonstrates the usage of Lombok's experimental @SuperBuilder annotation.
 * This example involves a base class and a derived class using the builder pattern.
 */
public class ExperimentalFeaturesExample {

    public static void main(String[] args) {
        // Create an instance of the Car class using the @SuperBuilder feature.
        Car car = Car.builder()
                .make("Tesla")
                .model("Model S")
                .doors(4)
                .build();

        System.out.println(car);
    }

    /**
     * Base class representing a Vehicle.
     */
    @SuperBuilder
    static class Vehicle {
        private final String make;
        private final String model;

        @Override
        public String toString() {
            return "Vehicle{make='" + make + "', model='" + model + "'}";
        }
    }

    /**
     * Derived class representing a Car, extending Vehicle.
     */
    @SuperBuilder
    static class Car extends Vehicle {
        private final int doors;

        @Override
        public String toString() {
            return "Car{make='" + super.toString() + ", doors=" + doors + "}";
        }
    }
}
