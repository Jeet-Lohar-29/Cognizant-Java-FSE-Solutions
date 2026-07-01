# Exercise 1 – Singleton Pattern

## Objective

Implement the Singleton Design Pattern to ensure that only one instance of the Logger class exists throughout the application lifecycle.

## Scenario

A logging utility should maintain only one instance to ensure consistent logging across the application.

## Files

- Logger.java
- SingletonDemo.java

## How to Compile

```bash
javac *.java
```

## How to Run

```bash
java SingletonDemo
```

## Expected Output

```
Logger instance created.
[LOG] Application Started
[LOG] User Logged In

Logger 1 HashCode : XXXXXXXX
Logger 2 HashCode : XXXXXXXX

Only one Logger instance exists.
```

## Design Pattern Used

Singleton Pattern

## Learning Outcome

- Singleton Pattern
- Private Constructor
- Static Instance
- Static Methods
- Object Comparison