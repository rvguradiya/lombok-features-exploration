# Lombok Configuration Explanation

Lombok provides a `lombok.config` file that allows you to customize how Lombok behaves in your projects. This file can be placed in the root directory of your project or in any subdirectory, and its settings apply to all Java files within the directory and its subdirectories.

---

## Why Use `lombok.config`?

The `lombok.config` file:
- Enables project-specific configurations for Lombok.
- Controls which Lombok features are enabled or disabled.
- Helps enforce consistent coding standards across your team.

---

## Configuration Basics

### File Placement
- Place `lombok.config` in the root of your project or module for global configurations.
- The settings cascade down to subdirectories unless overridden by another `lombok.config` file.

### Syntax
- Use `key = value` pairs for configurations.
- Add comments using `#` at the beginning of a line.

Example:
```plaintext
# Enable constructor generation by default
lombok.anyConstructor.suppressConstructorProperties = true
```

---

## Common Settings

Here are some commonly used configurations:

### General
| Setting                         | Description                                                   | Default |
|---------------------------------|---------------------------------------------------------------|---------|
| `config.stopBubbling`           | Stops `lombok.config` from cascading into parent directories. | `false` |
| `lombok.addGeneratedAnnotation` | Adds `@Generated` annotation to generated code.               | `false` |

### Getter/Setter Behavior
| Setting                                | Description                                          | Default |
|----------------------------------------|------------------------------------------------------|---------|
| `lombok.accessors.chain`               | Enables chained setters (returns `this`).            | `false` |
| `lombok.accessors.fluent`              | Removes `get`/`set` prefixes from generated methods. | `false` |
| `lombok.accessors.prefix`              | Specifies prefixes to strip from field names.        | N/A     |

Example:
```plaintext
# Enable fluent setters
lombok.accessors.fluent = true

# Set prefixes to strip
lombok.accessors.prefix += m_  # For fields like m_name
lombok.accessors.prefix += _   # For fields like _name
```

### Logging
| Setting                                | Description                                       | Default |
|----------------------------------------|---------------------------------------------------|---------|
| `lombok.log.fieldName`                 | Specifies the name of the generated logger field. | `log`   |
| `lombok.log.custom.declaration`        | Customizes the logging framework.                 | N/A     |

### Experimental Features
| Setting                                | Description                                            | Default |
|----------------------------------------|--------------------------------------------------------|---------|
| `lombok.experimental.flagUsage`        | Flags usage of experimental annotations.               | `error` |

---

## Example `lombok.config` File

```plaintext
# Disable bubbling to parent directories
config.stopBubbling = true

# Add @Generated annotations
lombok.addGeneratedAnnotation = true

# Enable chained setters and fluent methods
lombok.accessors.chain = true
lombok.accessors.fluent = true

# Prefixes to strip from fields
lombok.accessors.prefix += _

# Customize logger name
lombok.log.fieldName = logger
```

---

## Best Practices

1. **Centralize Configuration:** Keep your `lombok.config` in the root directory to avoid confusion.
2. **Document Changes:** Add comments to explain why certain configurations are set.
3. **Avoid Overriding Without Necessity:** Multiple `lombok.config` files can complicate project maintenance.

---

## Additional Resources
- [Official Lombok Configuration Documentation](https://projectlombok.org/features/configuration)
- [Lombok GitHub Repository](https://github.com/projectlombok/lombok)

---

Use this guide to customize Lombok for your project's needs and ensure a smooth development experience!

