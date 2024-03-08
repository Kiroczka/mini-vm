# Project of Kira
# Mini-VM

## Description

Mini-VM is a minimalist virtual machine. It features a small but powerful subset of operations, including basic arithmetic expressions, variable initialization, function declaration and invocation, support for basic data types, and predefined functions for output.

## Features

Mini-VM supports the following features:

- **Arithmetic Expressions**: Perform basic arithmetic operations like sum (`+`), difference (`-`), and product (`*`).
- **Variable Initialization**: Declare and initialize variables with support for basic data types.
- **Function Declaration and Invocation**: Define and call functions, allowing for reusable code blocks.
- **Data Types**: Currently supports two data types - `int` for integers and `text` for string values.
- **Predefined Functions**: Includes `print` and `println` functions for standard output, enabling basic interaction with the execution environment.

## Requirements

- Ensure you have a modern Java Development Kit (JDK) installed, as Mini-VM is developed in Kotlin and runs on the Java Virtual Machine (JVM).

## Usage

Mini-VM accepts programs written in its simple language through standard input or a file. Here's a quick example to get you started:

```kotlin
// Declare a variable
var x = 5
int y = 10
text hello = "Hello world!"

// Declare a function
fun add(int a, int b) {
    return a + b
}

// Use predefined functions to print results
println(hello)
```

## Limitations
Keep in mind, that breaking existing limitations could lead to unexpected results. 
- **No nested function declarations**: The language doesn't support nested function declarations.
- **No nested calls**: The language doesn't support nested function calls.
- **No brackets**: The language doesn't support the use of brackets in arithmetical expressions.
- **One line variable initialization**: Fit your initialization in one line. 
- **Dynamic typing**:  
- **Global variable names**: Your variable values are safe within a function. However, you must come up with unique names for variables and arguments to execute them. Use the power of your keyboard! ;)


## Developer Notes

The idea behind the compilation process is to divided the code into small code parts `SyntaxElement` using `Compiler` classes and delegate its building to `Builder` classes. The `CompilerCoordinator` class is doing this job. The logic is the same for `Statement` and `Expression` classes. Each concrete compiler can return final `SyntaxElement` or require further compilation by providing parts of the code to compile. 

## Improvement Ideas

- Adding negative test cases and unit tests.
- Making hidden contract between Builders and Compilers explicit or ensuring matching.
- Creating a generic container for variables and functions in the `Context`.
- Removing regexes as they slow performance and are impossible to debug.
- Adding logging for a more straightforward debugging process.

## Contributions
Contributions to Mini-VM are welcome! Whether it's bug reports, feature requests, or pull requests, all contributions help make Mini-VM a better tool.
