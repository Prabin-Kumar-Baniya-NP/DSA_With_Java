# Java Interview Questions

## Basic

---

### 1. Why is Java platform indepenedent ?

- When we compile our java programs, Java produces byte code(.class). We can run this byte code in any machine whether it is Windows, Mac, or Linux with the help of JRE (Java Runtime Environment).

---

### 2. Why java is not pure object oriented language ?

- Java supports eight different primitive data types (byte, int, float, short, long, double, boolean, char). This is the reason of java is not pure object oriented language.

---

### 3. Describe how Java uses stack and heap memory.

- When we run any java programs, JVM divides the memory into two parts i.e. Stack and Heap.

- Stack stores all the local variables, reference to objects and order of method execution.
  Stack follows Last-In-First-Out order.

- While heap stores all the objects and this objects are referenced in the stack memory during program execution. Heap uses dynamic memory allocation and deallocation stragegy for memory management.

---

### 4. What is the difference between local variable and instance variable

- Instance Variable:

  - Instance Variables are those variables which are declared inside the class but outside of any methods, constructors and blocks.
  - Instance variables represents the properties of the object.
  - Every object has its own copy of instance variables.

- Local Variables:
  - Local variables are those variables which are created inside of a function, constructors or any block of code.
  - Its scope is limited to only a method in which it is created. No any method. can access the local variables of another methods.

---

### 5. What are the default values assigned to variables and instances in java?

- In case of variables,

  - We need to initialize the variable before we use, otherwise, Java will throw a compilation error.

- In case of instance variables,
  - The default constructor will assign a value to the instance variables depending on the data type.
    - If it is a reference, then it will be assigned to null.
    - If it is numeric, then it will assign to 0.
    - If it is a boolean, then it will be assigned to false. Etc.

---

### 6. Describe about JIT compiler.

Execution of Java Program / Working of JIT (Just-In-Time Compilation)

1. At compile time (javac File.java), the compiler compiles the Java code (.java) into byte code (.class)

2. During run time (java File) inside the JVM, the byte code generated (.class) will be loaded by the class loader.

3. Then we have byte code verifier, which checks the byte code for any errors.

4. The byte code verifier passes the byte code to either interpreter or the JIT based on certain conditions (condition is if there is any code segments like duplicate statements that can be optimized).

5. JIT optimizes the code whenever it is possible and then it passes the byte code to the interpreter.

6. The intepreter interprets the byte code line by line and then it is executed by the operating system.

---

### 7. Differentiate between equals() method and equality operator (==).

- equals() method is used to check the equality of contents between two objects.

- equality operator (==) is used to compare the address or references of two objects.

---

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

---

### 9. Explain constructor overloading, method overloading, method overriding.

1. Constructor Overloading

   - Constructor overloading is a technique which allows you to have more than one constructor within the same class but with different functionality.

2. Method Overloading (Compile-Time Polymorphism)

   - Method overloading is a technique which allows you to have more than one function with the same function name but with different functionality.

   - Method overloading can be possible on the following basis: - The return type of the overloaded function. - The type of the parameters passed to the function. - The number of parameters passed to the function.

3. Method Overriding (Run-time Polymorphism)

   - Method overriding is the concept in which two methods having the same method signature are present in two diﬀerent classes in which an inheritance relationship is present.

   - Method overriding means when the child class contains the method which is already present in the parent class.

---

### 10. Define copy constructor in Java.

- Copy Constructor is the constructor used when we want to initialize the value to the new object from the old object of the same class.

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

---

### 11. Can the main method be overloaded ?

- Yes, we can overload the main method. But JVM will call only the original main method on program execution. => public static void main(String args[])

- The overloaded main method is not invoked.

- However, we can call overloaded main method from the original main method definition.

---

### 12. Differentiate between throw and throws.

1. Throw:

- Java throw keyword is used throw an exception explicitly in the code, inside the function or the block of code.
- throw is used within the method.
- We are allowed to throw only one exception at a time i.e. we cannot throw multiple exceptions.
- Throw keyword cannot propagate checked exceptions.

2. Throws:

- While, Java throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code.
- While, throws is used with the method signature.
- While, We can declare multiple exceptions using throws keyword that can be thrown by the method.
  For example, main() throws IOException, SQLException.
- While, throws keyword is used to propagate the checked Exceptions only.

---

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

---

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

## Intermediate Questions

---

### 1. What strings is immutable in Java ?

- For optimization

  - For the optimization of string, designers of Java introduced String pool. String pool is a storage area in Java Heap Memory which stores string literal. To implement the string pool concept, strings was made immutable.

  - For example:

    ```
    String str1 = "Apple";
    String str2 = "Apple";
    ```

  - Both str1 and str2 will point to same string literal "Apple" in String Pool. But if Java strings are not made immutable, str2 can be changed to some other value and eventually it will effect str1.

- Security Reason

  - If we don't make the String immutable, it will pose a serious security threat to the application.
  - For example, database usernames, passwords are passed as strings to receive database connections. The socket programming host and port descriptions are also passed as strings. The String is immutable, so its value cannot be changed. If the String doesn't remain immutable, any hacker can cause a security issue in the application by changing the reference value.

- Thread-Safety Reason

  - The String is safe for multithreading because of its immutableness. Different threads can access a single "String instance". It removes the synchronization for thread safety because we make strings thread-safe implicitly.

---

### 2. What is singleton class in Java and How it is implemented ?

- In object-oriented programming, a singleton class is a class that can have only one object at a time.

- The primary purpose of a Singleton class is to restrict the limit of the number of object creation to only one. This often ensures that there is access control to resources, for example, socket or database connection.

- How to design a singleton class in Java ?

  - Make the constructor private.
  - Create a static method that has return type of object of that singleton class.

    ```
    class Singleton {
        private static Singleton single_instance = null;

        public String s;

        private Singleton()
        {
            s = "Hello I am a string part of Singleton class";
        }

        public static Singleton getInstance()
        {
            if (single_instance == null)
                single_instance = new Singleton();

            return single_instance;
        }
    }

    // Main class
    class MyClass {
        // Main driver method
        public static void main(String args[])
        {
            // Instantiating Singleton class with variable x
            Singleton x = Singleton.getInstance();

            // Instantiating Singleton class with variable y
            Singleton y = Singleton.getInstance();

            // Instantiating Singleton class with variable z
            Singleton z = Singleton.getInstance();

            // Condition check
            if (x == y && y == z) {
                System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
            }
            else {
                System.out.println("Three objects DO NOT point to the same memory location on the heap");
            }
        }
    }
    ```

---

### 3. Diffentiate between inteface and abstract class.

1. Abstract:

- The abstract keyword is used to declare abstract class.
- An abstract class can be extended using keyword "extends".
- Abstract class doesn't support multiple inheritance.
- Abstract class can have abstract and non-abstract method.
- Abstract class can provide the implementation of interface.

2. Interface:

- The interface keyword is used to declare interface.
- An interface can be implemented using keyword "implements".
- Interface supports multiple inheritance.
- Interaface can have only abstract method. Since Java 8, we can have static and default methods also.
- Interface can't provide the implementation of abstract class.

---

### 4. What is Comparator in Java ?

- Consider the example where we have an ArrayList of employees like( EId, Ename, Salary), etc. Now if we want to sort this list of employees based on the names of employees. Then that is not possible to sort using the Collections.sort() method. We need to provide something to the sort() function depending on what values we have to perform sorting. Then in that case a comparator is used.

- Comparator is the interface in java that contains the compare method. And by overloading the compare method, we can define that on what basis we need to compare the values.

---

### 5. Can we override static and private methods ?

No, we cannot override static and private methods because method overriding is based on dynamic binding at runtime and binding of private, static and final methods always happen at compile time.

---

### 6. Why is the character array preferred over string for storing confidential information ?

- In Java, a string is basically immutable i.e. it cannot be modified. After its declaration, it continues to stay in the string pool as long as it is not removed in the form of garbage.

-In other words, a string resides in the heap section of the memory for an unregulated and unspecified time interval after string value processing is executed.

- As a result, vital information can be stolen for pursuing harmful activities by hackers if a memory dump is illegally accessed by them. Such risks can be eliminated by using mutable objects or structures like character arrays for storing any variable.

- After the work of the character array variable is done, the variable can be configured to blank at the same instant. Consequently, it helps in saving heap memory and also gives no chance to the hackers to extract vital data.

---

### 7. What do we get in the JDK file ?

- JDK

  - For making java programs, we need some tools that are provided by JDK (Java Development Kit).
    JDK is the package that contains various tools, Compiler, Java Runtime Environment, etc.

- JRE

  - To execute the java program we need an environment. (Java Runtime Environment) JRE contains a library of Java classes + JVM. What are JAVA Classes? It contains some predefined methods that help Java programs to use that feature, build and execute.

  - For example - there is a system class in java that contains the print-stream method, and with the help of this, we can print something on the console.

- JVM (Java Virtual Machine)

  - JVM is a part of JRE that executes the Java program at the end. Actually, it is part of JRE, but it is software that converts bytecode into machine-executable code to execute on hardware.

---

### 8. Differentiate between constructor and method in Java ?

1. Constructor:

- Constructor is used for initializing the object state.
- Constructor has no return type.
- Constructor gets invoked implicitly.
- If the constructor is not defined, then a default constructor is provided by the java compiler.
- The constructor name should be equal to the class name.
- A constructor cannot be marked as final because whenever a class is inherited, the constructors are not inherited. Hence, marking it final doesn't make sense. Java throws compilation error saying - modifier final not allowed here

2. Method:

- Method is used for exposing the object's behavior.
- Method should have a return type. Even if it does not return anything, return type is void.
- Method has to be invoked on the object explicitly.
- The name of the method can have any name or have a class name too.
- A method can be defined as final but it cannot be overridden in its subclasses.

---

---

### 9. What is the use of start and run method in Java Multithreading?

- start() method is used for creating a separate call stack for the thread execution.
- Once the call stack is created, JVM calls the run() method for executing the thread in that call stack.

---

### 10. What are the different types of Thread Priorities in Java? And what is the default priority of a thread assigned by JVM?

- There are a total of 3 different types of priority available in Java.

  - MIN_PRIORITY: It has an integer value assigned with 1.
  - MAX_PRIORITY: It has an integer value assigned with 10.
  - NORM_PRIORITY: It has an integer value assigned with 5.

- In Java, Thread with MAX_PRIORITY gets the first chance to execute.
- But the default priority for any thread is NORM_PRIORITY assigned by JVM.

---

### 11. Which among String or String Buffer should be preferred when there are lot of updates required to be done in the data?

- StringBuffer is mutable and dynamic in nature whereas String is immutable.
- Every updation / modification of String creates a new String thereby overloading the string pool with unnecessary objects.
- Hence, in the cases of a lot of updates, it is always preferred to use StringBuffer as it will reduce the overhead of the creation of multiple String objects in the string pool.

---

### 12. How to not allow serialization of attributes of a class in Java?

- In order to achieve this, the attribute can be declared along with the usage of transient keyword.

```

private transient String someInfo;

```

---

### 13. What happens if the static modifier is not included in the main method signature in Java?

- There wouldn't be any compilation error.
- But then the program is run, since the JVM cant map the main method signature, the code throws “NoSuchMethodError” error at the runtime.

---

### 14. Consider the below program, identify the output, and also state the reason for that.

```

public class Main{
public static void main(String[] args) {
System.out.println(" Hello. Main Method. ");
}
public static void main(int[] args) {
System.out.println(" Hello. Main Method2. ");
}
}

```

- The output of the above program will be Hello. Main Method.
- This is because JVM will always call the main method based on the definition it already has.
- Doesn't matter how many main methods we overload it will only execute one main method based on its declaration in JVM.

---

### 15. Can we make the main() thread a daemon thread?

- In java multithreading, the main() threads are always non-daemon threads.
- And there is no way we can change the nature of the non-daemon thread to the daemon thread.

---

### 16. What happens if there are multiple main methods inside one class in Java?

- The program can't compile as the compiler says that the method has been already defined inside the class.

---

### 17. How does an exception propagate in the code?

- When an exception occurs, first it searches to locate the matching catch block. In case, the matching catch block is located, then that block would be executed. Else, the exception propagates through the method call stack and goes into the caller method where the process of matching the catch block is performed. This propagation happens until the matching catch block is found. If the match is not found, then the program gets terminated in the main method.

---

### 18. Is it mandatory for a catch block to be followed after a try block?

- No, it is not necessary for a catch block to be present after a try block.
- A try block should be followed either by a catch block or by a finally block.
- If the exceptions likelihood is more, then they should be declared using the throws clause of the method.

---

### 19. Will the finally block get executed when the return statement is written at the end of try block and catch block as shown below?

```

public int someMethod(int i){
try{
//some statement
return 1;
}catch(Exception e){
//some statement
return 999;
}finally{
//finally block statements
}
}

```

- finally block will be executed irrespective of the exception or not.
- The only case where finally block is not executed is when it encounters ‘System.exit()’ method anywhere in try/catch block.

---

### 20. Contiguous memory locations are usually used for storing actual values in an array but not in ArrayList. Explain.

- In the case of ArrayList, data storing in the form of primitive data types (like int, float, etc.) is not possible.
- The data members/objects present in the ArrayList have references to the objects which are located at various sites in the memory.
- Thus, storing of actual objects or non-primitive data types (like Integer, Double, etc.) takes place in various memory locations.

---

### 21. Why does the java array index start with 0?

- It is because the 0 index array avoids the extra arithmetic operation to calculate the memory address.

- Example - Consider the array and assume each element takes 4-byte memory space.

- Now if we want to access index 4. Then internally java calculates the address using the formula-

  - [Base Address + (index * no_of_bytes)].
  - So according to this. The starting address of the index 4 will be - [100 + (4*4)] = 116.

- Now consider the same with 1 index Array

  - Now if we apply the same formula here. Then we get - 116 as the starting address of the 4th index. Which is wrong.
  - Then we need to apply formula - [Base Address + ((index-1) * no_of_bytes)].
  - And for calculating this, an extra arithmetic operation has to be performed.
  - And consider the case where millions of addresses need to be calculated, this causes complexity. So to avoid this, the index array is supported by java.

---

## Advanced Questions

---

### 1. Explain Association, Aggregation, Composition, Generalization, Specialization.

- Association:

  - If two classes in a model need to communicate with each other, there must be a link between them, and that can be represented by an association
  - ![Association](https://cdn-images.visual-paradigm.com/guide/uml/uml-aggregation-vs-composition/01-uml-association.png)
  - Example 1 : A single student can associate with multiple teachers.
  - Example 2 : Every Instructor has one or more Students.
  - Aggregation and Composition are subsets of association

- Aggregation:

  - Aggregation is a subset of Association.
  - ![Aggregation](https://cdn-images.visual-paradigm.com/guide/uml/uml-aggregation-vs-composition/02-uml-aggregation.png)
  - Aggregation implies a relationship where the child can exist independently of the parent.
  - Example: Class (parent) and Student (child). Delete the Class and the Students still exist.

- Composition:

  - Composition is a subset of Association.
  - ![Composition](https://cdn-images.visual-paradigm.com/guide/uml/uml-aggregation-vs-composition/03-uml-composition.png)
  - Composition implies a relationship where the child cannot exist independent of the parent.
  - Example: House (parent) and Room (child). Rooms don't exist separate to a House.

- Generalization:

  - Generalization is a mechanism for combining similar classes of objects into a single, more general class.
  - Generalization is the term that we use to denote abstraction of common properties into a base class in UML.
  - The UML diagram's Generalization association is also known as Inheritance.
  - When we implement Generalization in a programming language, it is often called Inheritance instead. Generalization and inheritance are the same.
  - The terminology just differs depending on the context where it is being used.

- Specialization:

  - Specialization is the reverse process of Generalization means creating new sub-classes from an existing class.

---

### 2. Although inheritance is a popular OOPs concept, it is less advantageous than composition.

- The composition is a design technique in which your class can have an instance of another class as a field of your class.
- Inheritance is a mechanism under which one object can acquire the properties and behavior of the parent object by extending a class.

- Inheritance Example:
  ```
  class Animal{
  String name="Orio";
  }
  class Dog extends Animal{
  String type="Dog";
  public static void main(String args[]){
      Dog p=new Dog();
      System.out.println("Name:"+p.name);
      System.out.println("Type:"+p.type);
  }
  }
  ```
- Composition Example:

  ```
  public class Student {
  }
  public class College {
  private Student student;
  public College() {
      this.student = new Student();
  }
  }
  ```

- Inheritance lags behind composition in the following scenarios:

  - Multiple-inheritance is not possible in Java. Classes can only extend from one superclass. In cases where multiple functionalities are required, for example - to read and write information into the file, the pattern of composition is preferred. The writer, as well as reader functionalities, can be made use of by considering them as the private members.

  - Composition assists in attaining high flexibility and prevents breaking of encapsulation.

  - Unit testing is possible with composition and not inheritance. When a developer wants to test a class composing a different class, then Mock Object can be created for signifying the composed class to facilitate testing. This technique is not possible with the help of inheritance as the derived class cannot be tested without the help of the superclass in inheritance.

- The loosely coupled nature of composition is preferable over the tightly coupled nature of inheritance.

---

### 3. How is the creation of a String using new() different from that of a literal?

<b>Creating String Using String Literal:</b>

```
String first = "InterviewBit";
String second = "InterviewBit";
```

This two line of code will create a single string literal in String pool and first and second will point to same string literal.

<b>Creating String using new keyword:</b>

```
String first = new String("InterviewBit");
String second = new String("InterviewBit");
```

This two line of code will create two different string object in heap memory not in String pool and first and second will point to different string object in heap memory.

---

### 4. Why is synchronization necessary ?

- Concurrent execution of different processes is made possible by synchronization.
- When a particular resource is shared between many threads, situations may arise in which multiple threads require the same shared resource.
- Synchronization assists in resolving the issue and the resource is shared by a single thread at a time. Let’s take an example to understand it more clearly.

---

### 5. In the given code below, what is the significance of ... ?

```
public void fooBarMethod(String... variables){
   // method code
}
```

- Ability to provide ... is a feature called varargs (variable arguments) which was introduced as part of Java 5.
- The function having ... in the above example indicates that it can receive multiple arguments of the datatype String.

---

### 6. Explain Life cycle of thread in Java ?

- In Java, a thread always exists in any one of the following states. These states are:

  - New
  - Active
  - Blocked / Waiting
  - Timed Waiting
  - Terminated

- New

  - Whenever a new thread is created, it is always in the new state. For a thread in the new state, the code has not been run yet and thus has not begun its execution.

- Active

  - When a thread invokes the start() method, it moves from the new state to the active state.
  - The active state contains two states within it:

    - one is runnable,
    - the other is running.

  - Runnable :

    - In the runnable state, the thread may be running or may be ready to run at any given instant of time.
    - It is the duty of the thread scheduler to provide the thread time to run, i.e., moving the thread the running state.

  - Running:
    - When the thread gets the CPU, it moves from the runnable to the running state.
    - Generally, the most common change in the state of a thread is from runnable to running and again back to runnable.

- Blocked / Waiting

  - Whenever a thread is inactive for a span of time (not permanently) then, either the thread is in the blocked state or is in the waiting state.
  - When the main thread invokes the join() method then, it is said that the main thread is in the waiting state.
  - The main thread then waits for the child threads to complete their tasks.
  - When the child threads complete their job, a notification is sent to the main thread, which again moves the thread from waiting to the active state.

- Timed Waiting

  - Sometimes, waiting for leads to starvation.
  - For example, a thread (its name is A) has entered the critical section of a code and is not willing to leave that critical section.
  - In such a scenario, another thread (its name is B) has to wait forever, which leads to starvation. To avoid such scenario, a timed waiting state is given to thread B.
  - Thus, thread lies in the waiting state for a specific span of time, and not forever.
  - A real example of timed waiting is when we invoke the sleep() method on a specific thread.
  - The sleep() method puts the thread in the timed wait state. After the time runs out, the thread wakes up and start its execution from when it has left earlier.

- Termination
  - A thread reaches the termination state because of the following reasons:
    - When a thread has finished its job, then it exists or terminates normally.
    - Abnormal termination: It occurs when some unusual events such as an unhandled exception or segmentation fault.

---

### 7. What are the possible ways of making object eligible for garbage collection (GC) in Java?

- Approach 1 : Set the object references to null once the object creation purpose is served.
- Approach 2 : Point the reference variable to another object. Doing this, the object which the reference variable was referencing before becomes eligible for GC.

---

### 8. What is a Memory Leak ?

- The Java Garbage Collector (GC) typically removes unused objects when they are no longer required, but when they are still referenced, the unused objects cannot be removed.
- So this causes the memory leak problem.

- Some common causes of Memory leaks are -
  - When there are Unbounded caches.
  - Excessive page swapping is done by the operating system.
  - Improper written custom data structures.
  - Inserting into a collection object without first deleting it.
    etc.

---

### 9. Assume a thread has a lock on it, calling the sleep() method on that thread will release the lock?

- A thread that has a lock won't be released even after it calls sleep(). Despite the thread sleeping for a specified period of time, the lock will not be released.

---
