# 1.6-Generics-Level1

## 📄 Description – Exercise Statement

This project contains the solution to the following Java exercises:

### Exercise 1
Create a class called `NoGenericMethods` that stores three arguments of the same type.  
The class must include:
- A constructor to initialize the three arguments.
- Getters and setters to access/modify the values.

Verify that the arguments can be passed in **any order** to the constructor.

#### ✅ What was implemented
- `NoGenericMethods` class with three attributes of the same type.
- Constructor that accepts values in any order.
- Methods to get and set each argument.
- `NoGenericMethodsApp` with a `main()` to demonstrate usage.

---

### Exercise 2
Create a class called `Persona` with attributes:
- `name`
- `surname`
- `age`

Then, create a class called `GenericMethods` with a **generic method** that accepts three generic arguments.  
The method should simply print the arguments it receives.

In the `main()` method of `GenericMethodsApp`, call the generic method with parameters of different types to verify that any type and order is allowed.

Example: a `Persona` object, a `String`, and a primitive type.

#### ✅ What was implemented
- `Persona` class with attributes, constructor, and `toString()` for readable output.
- `GenericMethods` class with a method:
 ```
public <T, U, V> void printArguments(T arg1, U arg2, V arg3)
 ```
- `GenericMethodsApp` class with a `main()` to test:
  - `Persona`, `String`, and `int`.
  - Other combinations like `String`, `double`, `boolean`.

---

## 💻 Technologies Used
- Java 17  
- IntelliJ IDEA  
- Git & GitHub  

---

## 📋 Requirements
- JDK 17 or higher installed  
- IntelliJ IDEA (or any Java-compatible IDE)  
- Git  

---

## 🛠️ Installation
Clone the repository and access the project folder:

```sh
git clone https://github.com/leilaweicman/1.6-Generics-Level1.git
cd 1.6-Generics-Level1
```

---

## ▶️ Execution

### Exercise 1

Compile and run:

```sh
javac -d out src/exercise1/*.java
java -cp out exercise1.GenericMethodsApp
```

### Exercise 2

Compile and run:

```sh
javac -d out src/exercise2/*.java
java -cp out exercise2.GenericMethodsApp
```

---

## 🌐 Deployment
Not applicable (local practice project).


---

## 🤝 Contributions

1. Fork this repository.
2. Create a new branch:
```sh
git checkout -b feature/NewFeature
```
3. Commit your changes:
```sh
git commit -m "Add NewFeature"
```
4. Commit your changes:
```sh
git push origin feature/NewFeature
```
5. Open a Pull Request.
