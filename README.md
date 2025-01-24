# Lombok Features Exploration

Welcome to the **Lombok Features Exploration** repository! This project showcases the powerful features of the [Lombok](https://projectlombok.org/) library, which is widely used to reduce boilerplate code in Java applications.

---

## Table of Contents

1. [Overview](#overview)
2. [Features](#features)
3. [Getting Started](#getting-started)
4. [Project Structure](#project-structure)
5. [Usage Examples](#usage-examples)
6. [Testing](#testing)
7. [Documentation](#documentation)
8. [Contributing](#contributing)
9. [License](#license)

---

## Overview

Lombok simplifies Java development by automating repetitive tasks such as generating getters, setters, constructors, and more. It improves code readability and reduces boilerplate, allowing developers to focus on core logic.

This repository explores and demonstrates:

- Core annotations (e.g., `@Getter`, `@Setter`, `@Data`, `@Builder`)
- Advanced features (e.g., `@SneakyThrows`, `@UtilityClass`, logging annotations)
- Experimental capabilities

---

## Features

### Core Features:

- **Getters and Setters**: Use `@Getter` and `@Setter` to automatically generate getter and setter methods.
- **Constructors**: Simplify constructors with `@NoArgsConstructor`, `@AllArgsConstructor`, and `@RequiredArgsConstructor`.
- **Builder Pattern**: Generate builder classes with `@Builder`.
- **ToString, Equals, and HashCode**: Generate methods using `@ToString` and `@EqualsAndHashCode`.
- **Data Classes**: Combine annotations using `@Data`.
- **Immutable Objects**: Use `@Value` to create immutable classes.

### Advanced Features:

- **Exception Handling**: Suppress checked exceptions with `@SneakyThrows`.
- **Logging**: Leverage logging annotations like `@Slf4j` and `@Log`.
- **Utility Classes**: Create static utility classes with `@UtilityClass`.

### Experimental Features:

- Learn about experimental annotations such as `@SuperBuilder` and others.

---

## Getting Started

### Prerequisites

- **Java 8+**
- **Maven** or **Gradle**

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/rvguradiya/lombok-features-exploration.git
   cd lombok-features-exploration
   ```

2. Add Lombok to your `pom.xml` (for Maven):

   ```xml
   <dependency>
       <groupId>org.projectlombok</groupId>
       <artifactId>lombok</artifactId>
       <version>1.18.28</version>
       <scope>provided</scope>
   </dependency>
   ```

   Or to `build.gradle` (for Gradle):

   ```groovy
   implementation 'org.projectlombok:lombok:1.18.28'
   annotationProcessor 'org.projectlombok:lombok:1.18.28'
   ```

3. Enable annotation processing in your IDE (e.g., IntelliJ IDEA or Eclipse).

---

## Project Structure

```plaintext
lombok-features-exploration/
├── README.md
├── pom.xml (or build.gradle)
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── lombokfeatures/
│   │   │               ├── annotations/
│   │   │               │   ├── GetterSetterExample.java
│   │   │               │   ├── ToStringEqualsHashCodeExample.java
│   │   │               │   ├── ConstructorExample.java
│   │   │               │   ├── BuilderExample.java
│   │   │               │   ├── DataAnnotationExample.java
│   │   │               │   ├── ValueAnnotationExample.java
│   │   │               │   ├── SneakyThrowsExample.java
│   │   │               │   ├── LogExample.java
│   │   │               │   ├── ExperimentalFeaturesExample.java
│   │   │               ├── config/
│   │   │               │   ├── LombokConfigExplanation.md
│   │   │               └── utils/
│   │   │                   ├── UtilityExample.java
│   ├── test/
│       ├── java/
│           └── com/
│               └── example/
│                   └── lombokfeatures/
│                       ├── annotations/
│                       │   ├── DataAnnotationTest.java
│                       │   ├── BuilderAnnotationTest.java
│                       └── utils/
│                           ├── UtilityExampleTest.java
├── docs/
│   ├── LombokOverview.md
│   ├── CommonPitfalls.md
│   └── FAQ.md
└── .gitignore
```

---

## Usage Examples

Explore the examples in the `src/main/java/com/example/lombokfeatures/annotations` folder:

- **Getter and Setter**: `GetterSetterExample.java`
- **Constructors**: `ConstructorExample.java`
- **Builder Pattern**: `BuilderExample.java`
- **Data Class**: `DataAnnotationExample.java`
- **Exception Handling**: `SneakyThrowsExample.java`
- **Logging**: `LogExample.java`

Run these examples to observe the generated code and behavior.

---

## Testing

Unit tests are included in the `src/test/java/com/example/lombokfeatures` folder to validate the generated code and demonstrate best practices.

Run tests using:

```bash
mvn test
```

Or for Gradle:

```bash
gradle test
```

---

## Documentation

Additional documentation is available in the `docs/` folder:

- **LombokOverview\.md**: High-level overview of Lombok features.
- **CommonPitfalls.md**: Common issues and their solutions.
- **FAQ.md**: Frequently asked questions.

---

## Contributing

Contributions are welcome! Feel free to fork this repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.

---

## License

This project is licensed under the [MIT License](LICENSE).

---

Happy coding with Lombok! 🚀

