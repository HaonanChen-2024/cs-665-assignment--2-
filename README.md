<<<<<<< HEAD

| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Haonan Chen                |
| Date         | 11/10/2024                 |
| Course       | Fall                       |
| Assignment # | 2                          |

# # Delivery System Project
This project implements a notification system that informs drivers about delivery requests. It uses the Observer design pattern to notify all registered drivers when a new delivery request is created.

# GitHub Repository Link:
https://github.com/HaonanChen-2024/cs-665-assignment--2-

# Implementation Description 


For each assignment, please answer the following:

1. Flexibility in the Implementation
   The implementation uses the Observer design pattern to handle the notification system, which makes it highly flexible. By using the Observer interface, the system can easily add or remove different types of objects (like different kinds of delivery agents) without modifying the core logic of the system. For example:

To add a new type of driver (e.g., DroneDriver), simply create a class that implements the Observer interface, and the system will automatically send notifications to instances of that class.
The DeliveryObservable interface defines the methods for adding and removing observers (drivers), allowing for dynamic management of participants in the notification system. Future expansion of object types (e.g., more specific driver types, notification systems) can be done without altering the existing codebase.
2. Simplicity and Understandability
   The system is structured in a simple and modular way:

Each class has a well-defined responsibility, which adheres to the Single Responsibility Principle (SRP). For example, the Shop class is responsible for managing drivers and broadcasting delivery requests, while the Driver class is responsible for receiving and managing messages.
The clear separation of concerns ensures that the code is easy to read, maintain, and extend. Methods are short, descriptive, and focus on specific tasks, making the code more understandable.
The use of standard naming conventions and following the Google Java Style Guide makes the code readable for other developers.
3. Avoiding Duplicated Code
   Code duplication is avoided by:

Implementing reusable methods, such as notifyDrivers, which handles the core logic for sending notifications to all drivers. This method is called internally by sendDeliveryRequest, ensuring that the notification logic is centralized.
The Observer interface is implemented in the Driver class, so any future driver classes can inherit the behavior without duplicating code. This modularity ensures that the notification mechanism remains consistent across all types of drivers.
The use of interfaces (Observer, DeliveryObservable) allows for better separation of concerns, reducing the likelihood of duplicated functionality across different parts of the system.
4. Design Patterns
   The primary design pattern used in this implementation is the Observer Pattern. It was chosen because:

It provides a natural way to handle notifications in a distributed system where multiple drivers (observers) need to be informed of a new delivery request from a shop (observable).
The pattern decouples the sender (shop) from the receivers (drivers), which increases flexibility and scalability. The shop does not need to know the details of each driver, only that they implement the Observer interface.
This pattern makes it easy to add new types of drivers or modify existing ones without affecting the shop’s core logic, which aligns with the open/closed principle (OCP) of software design.
By leveraging the Observer pattern, the system maintains flexibility, ease of understanding, and eliminates code duplication, making it a robust and scalable solution for the delivery notification system.


# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




=======
# cs-665-assignment--2-
>>>>>>> a8fad0962472d05aefe54ce79babfd5d74c4d702
