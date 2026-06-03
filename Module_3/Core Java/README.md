# Java Master Practice Project

## Project Overview

Java Master Practice Project is a complete Java 21 learning repository containing 41 exercises from beginner to advanced levels. It is built with Maven, uses Java Modules, JDBC, networking, reflection, virtual threads, HTTP client APIs, and modern Java features.

## Java Concepts Covered

- Basic syntax and control flow
- Data types and type casting
- Functions, recursion, and method overloading
- Arrays, collections, streams, and lambda expressions
- Object-oriented programming (classes, inheritance, interfaces)
- Exception handling and custom exceptions
- File I/O
- JDBC with MySQL
- Modules (`com.utils`, `com.greetings`, `com.practice`)
- Networking using sockets
- HTTP client with Gson JSON parsing
- Reflection
- Virtual threads and executor services
- Bytecode inspection

## Folder Structure

- `pom.xml` - root aggregator Maven project
- `app/pom.xml` - main application module
- `modules/com.utils` - reusable utilities module
- `modules/com.greetings` - greeting module
- `app/src/main/java/com/practice/` - exercise source code
- `app/src/main/java/module-info.java` - module definition for `com.practice`

## How to Run

### Prerequisites

- Java 21 SDK installed
- Maven installed
- MySQL installed and running

### Build the project

```bash
cd d:/cognizant_digital_nature_5.0/Module-3
mvn clean install
```

### Run a simple exercise

```bash
cd app
mvn compile exec:java -Dexec.mainClass="com.practice.basics.HelloWorld"
```

For VS Code, use the Java extension pack and open the `Module-3` folder. The project is configured as a Maven multi-module workspace.

## Maven Commands

- `mvn clean install` - compile and build all modules
- `mvn -pl app test` - run tests only for app
- `mvn -pl app exec:java -Dexec.mainClass="com.practice.basics.HelloWorld"` - launch a specific class

## Database Setup

Create the MySQL database and table using these commands:

```sql
CREATE DATABASE studentdb;
USE studentdb;
CREATE TABLE students (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100),
  age INT,
  email VARCHAR(100)
);
```

Update `DBConnection.java` if your username or password differs.

## Networking Setup

- Run `TCPServer` first.
- Then run `TCPClient` in another terminal.
- Use the client to send text and receive server replies.

## Module Setup

This is a modular Java project with three modules:

- `com.utils` - utility functions
- `com.greetings` - greeting services
- `com.practice` - main exercise module that depends on the other two

### Compile modules manually

```bash
cd app
mvn compile
```

### Run a module-aware class

```bash
mvn -pl app exec:java -Dexec.mainClass="com.practice.methods.MethodOverloadingDemo"
```

## JDBC Setup

- Ensure MySQL is running.
- Create the `studentdb` database and `students` table.
- Run `JDBCInsertUpdateDemo`, `JDBCSelectDemo`, and `TransactionDemo`.
- The project uses `PreparedStatement` and transaction management.

## Expected Outputs

Each class prints a descriptive message and sample output. For interactive programs, follow the prompts.

## Screenshots Section

You can add your own screenshots by capturing output from VS Code terminal and saving images to the repository.

## Future Improvements

- Add unit tests for each exercise
- Add interactive menu for choosing exercises
- Introduce JavaFX examples
- Add REST API demonstrations
- Add performance analysis comparisons
