package com.example.lombokfeatures.annotations;

import lombok.extern.slf4j.Slf4j;

/**
 * Demonstrates the usage of Lombok's @Slf4j annotation.
 * The @Slf4j annotation automatically generates a logger instance for the class using SLF4J.
 */
@Slf4j
public class LogExample {

    public void performTask() {
        log.info("Task is starting...");
        System.out.println(log);
        try {
            // Simulate task execution
            Thread.sleep(1000);
            log.debug("Task is in progress...");

            if (Math.random() > 0.5) {
                throw new RuntimeException("Something went wrong!");
            }

            log.info("Task completed successfully.");
        } catch (Exception e) {
            log.error("An error occurred while performing the task: ", e);
        }
    }

    public static void main(String[] args) {
        LogExample example = new LogExample();

        // Execute the task and observe the log outputs
        example.performTask();
    }
}
