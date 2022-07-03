# Java Interview Questions

## Basic

### 1. Why is Java platform indepenedent ?

```
When we compile our java programs, Java produces byte code(.class). We can run this byte code in any machine whether it is Windows, Mac, or Linux with the help of JRE (Java Runtime Environment).
```

### 2. Why java is not pure object oriented language ?

```
Java supports eight different primitive data types (byte, int, float, short, long, double, boolean, char). This is the reason of java is not pure object oriented language.
```

### 3. Describe how Java uses stack and heap memory.

```
When we run any java programs, JVM divides the memory into two parts i.e. Stack and Heap.

Stack stores all the local variables, reference to objects and order of method execution.
Stack follows Last-In-First-Out order.

While heap stores all the objects and this objects are referenced in the stack memory during program execution. Heap uses dynamic memory allocation and deallocation stragegy for memory management.
```

### 4. What is the difference between local variable and instance variable

```
Instance Variables are those variables which are declared inside the class but outside of any methods, constructors and blocks.
Instance variables represents the properties of the object.
Every object has its own copy of instance variables.
```

```
Local variables are those variables which are created inside of a function, constructors or any block of code.
Its scope is limited to only a method in which it is created. No any method. can access the local variables of another methods.
```

### 5. What are the default values assigned to variables and instances in java?

```
In case of variables,
- We need to initialize the variable before we use, otherwise, Java will throw a compilation error.

In case of instance variables,
- The default constructor will assign a value to the instance variables depending on the data type.
    If it is a reference, then it will be assigned to null.
    If it is numeric, then it will assign to 0.
    If it is a boolean, then it will be assigned to false. Etc.
```

### 6. Describe about JIT compiler.

```
Execution of Java Program / Working of JIT (Just-In-Time Compilation)
1. At compile time (javac File.java), the compiler compiles the Java code (.java) into byte code (.class)

2. During run time (java File) inside the JVM, the byte code generated (.class) will be loaded by the class loader.

3. Then we have byte code verifier, which checks the byte code for any errors.

4. The byte code verifier passes the byte code to either interpreter or the JIT based on certain conditions (condition is if there is any code segments like duplicate statements that can be optimized).

5. JIT optimizes the code whenever it is possible and then it passes the byte code to the interpreter.

6. The intepreter interprets the byte code line by line and then it is executed by the operating system.
```

### 7. Differentiate between equals() method and equality operator (==).

```
equals() method is used to check the equality of contents between two objects.

equality operator (==) is used to compare the address or references of two objects.
```

### 8. How to declare an infinite loop in Java ?

```
for (;;)
{

}
```

```
while(true){

}
```

```
do{

}while(true);
```

### 9. Explain constructor overloading, method overloading, method overriding.

1. Constructor Overloading

```
Method overloading is a technique which allows you to have more than one constructor within the same class but with different functionality.
```

2. Method Overloading (Compile-Time Polymorphism)

```
Method overloading is a technique which allows you to have more than one function with the same function name but with different functionality.

Method overloading can be possible on the following basis:
    - The return type of the overloaded function.
    - The type of the parameters passed to the function.
    - The number of parameters passed to the function.
```

3. Method Overriding (Run-time Polymorphism)

```
Method overriding is the concept in which two methods having the same method signature are present in two diﬀerent classes in which an inheritance relationship is present.

Method overriding means when the child class contains the method which is already present in the parent class.
```

### 10. Define copy constructor in Java.

```
Copy Constructor is the constructor used when we want to initialize the value to the
new object from the old object of the same class.
```

```
class Car{
    String color;
    String brand;
    InterviewBit(Car tesla){
    this.color = tesla.color;
    this.brand = tesla.brand;
    }
}
```

### 11. Can the main method be overloaded ?

```
Yes, we can overload the main method. But JVM will call only the original main method on program execution. The overloaded main method is not invoked.
public static void main(String args[])

However, we can call overloaded main method from the original main method definition.
```

### 12. Differentiate between throw and throws.

```
Java throw keyword is used throw an exception explicitly in the code, inside the function or the block of code.
While, Java throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code.
```

```
throw is used within the method.
While, throws is used with the method signature.
```

```
We are allowed to throw only one exception at a time i.e. we cannot throw multiple exceptions.
While, We can declare multiple exceptions using throws keyword that can be thrown by the method.
For example, main() throws IOException, SQLException.
```

```
Throw keyword cannot propagate checked exceptions.
While, throws keyword is used to propagate the checked Exceptions only.
```

### 13. A single try block and multiple catch blocks can co-exist in a Java Program. Explain.

```
public static void main(String args[]) {
    try {
        int n = 1000, x = 0;
        int arr[] = new int[n];
        for (int i = 0; i <= n; i++) {
        arr[i] = i / x;
        }
    }
    catch (ArrayIndexOutOfBoundsException exception) {
        System.out.println("1st block = ArrayIndexOutOfBoundsException");
    }
    catch (ArithmeticException exception) {
        System.out.println("2nd block = ArithmeticException");
    }
    catch (Exception exception) {
        System.out.println("3rd block = Exception");
    }
}
```

### 14. Explain the use of final keyword in variable, method and class.

1. When a variable is declared as final in Java, the value can’t be modified once it has been assigned.

2. A method declared as final cannot be overridden by its children's classes.

3. When a class is declared as final, no other class can inherit that class. But that final class can extend other classes for its usage.

---

### 15. Is it possible that the ‘finally’ block will not be executed? If yes then list the case.

- Yes. It is possible that the ‘finally’ block will not be executed.

- The cases are-
  - Suppose we use System.exit() in the above statement.
  - If there are fatal errors like Stack overflow, Memory access error, etc.

---

### 16. Explain where can you use super keyword.

- Accessing data members of parent class when the member names of the class and its child subclasses are same.

- To call the default and parameterized constructor of the parent class inside the child class.

- Accessing the parent class methods when the child classes have overridden them.

---

### 17. Can the static methods be overloaded ?

- Yes! There can be two or more static methods in a class with the same name but diﬀering input parameters.

### 18. Can the static methods be overriidden ?

- No! overriding occurs at run-time. But static methods are loaded and looked up at the compile time. So, static methods cann't be overridden.

---

### 19. Why is the main method static ?

- Static members are those methods that belong to the classes, not to an individual object.

- Since the main method is static JVM can call it without creating an instance of a class that contains the main method.

- If the main method will not be static then for every object, it is available, and that is not acceptable by JVM.

---

### 20. Differentiate between static variables, static methods and static class.

- Static variables are those variables which belongs to the class, not to the object of that class.

- Static methods are those methods which belongs to the class, not to the object of that class.

- Static class: A class in java program cann't be static except if it is an innner class. If it is an inner static class, then it exactly works like other static members of the class.

---

### 21. What is the main objective of Garbage collector in Java?

- The main objective of Garbage collector is to free up memory space occupied by the unnecessary and unreacheable objects during the execution of java programs.

- Garbage collector ensures that the memory resources is used effectively.

### 22. What part of memory - Stack or Heap - is cleaned in garbage collection process?

- Heap. It is because heap stores all the objects and this objects are referenced in the stack memory during program execution.

---

### 23. Explain about shallow copy and deep copy

1. Shallow copy: The shallow copy only creates a new reference and points to the same object.

```
Rectangle obj2 = obj1;
```

2. Deep Copy: In a deep copy, we create a new object and copy the old object value to the new object.

```
Rectangle obj3 = new Rectangle();
Obj3.length = obj1.length;
Obj3.breadth = obj1.breadth;
```

---

### 24. What is class loader ?

- Java Classloader is the program that belongs to JRE (Java Runtime Environment).

- The task of ClassLoader is to load the required classes and interfaces to the JVM when required.

- Example- To get input from the console, we require the scanner class. And the Scanner class is loaded by the ClassLoader.

---
