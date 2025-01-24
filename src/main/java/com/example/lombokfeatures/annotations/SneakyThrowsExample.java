package com.example.lombokfeatures.annotations;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstrates the usage of Lombok's @SneakyThrows annotation.
 * The @SneakyThrows annotation allows you to throw checked exceptions without explicitly declaring them.
 */
public class SneakyThrowsExample {

    /**
     * Reads the first line of a file using @SneakyThrows to handle IOException implicitly.
     *
     * @param filePath Path to the file to be read.
     * @return The first line of the file.
     */
    @SneakyThrows(IOException.class)
    public String readFirstLine(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return reader.readLine();
        }
    }

    public static void main(String[] args) {
        SneakyThrowsExample example = new SneakyThrowsExample();

        // Replace with a valid file path for testing
        String filePath = "test.txt";

        try {
            String firstLine = example.readFirstLine(filePath);
            System.out.println("First line of the file: " + firstLine);
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
