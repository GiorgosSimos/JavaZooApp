# 🦁 Java Zoo App

A simple console-based zoo management system built in Java, designed to demonstrate core Object-Oriented Programming (OOP) principles.

> 🎓 Developed as part of an academic assignment during my MSc in Informatics.

## 🧰 Features

- Add new animals (Lion, Giraffe, Zebra, Hippo) to the zoo
- Search animals by name or code
- Remove animals by code
- Feed animals (interface-based polymorphic behavior)
- Save/load animal data using Java serialization

## 💡 Object-Oriented Concepts Demonstrated

- **Abstract Classes & Inheritance**: A generic `animal` abstract class with subclasses (`lion`, `zebra`, `hippo`, `giraffe`)
- **Interfaces**: `IFeedAnimal` interface implemented differently per animal
- **Encapsulation**: Private fields with getters/setters
- **Polymorphism**: Overridden `toString()` and `feedAnimal()` behavior
- **Serialization**: Saving/loading objects via `zoo_animals.ser`

## 🧪 Technologies Used

- Java 17+
- Java Serialization
- Console I/O

## 📦 How to Run

1. Clone the repository
2. Compile with any Java IDE (or command line)
3. Run the `SerializationActions` class to use the zoo app

```bash
javac *.java
java zooProject.SerializationActions
