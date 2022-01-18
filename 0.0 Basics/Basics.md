# JVM vs JDK vs JRE

### JVM

- It is a package that contains development tools to run our Java programs
- It contains JRE to execute our program.

### JDK

- It is a runtime environment that run our Java programs.

### JRE

- It acts as a runtime engine to run our Java program.
- JVM is responsible for executing Java programs line by line, hence it is also known as an interpreter.

---

# Conditionals

### 1. if-else

```
if (num1 % 2 == 0) {
    System.out.println("Even");
    }
else {
    System.out.println("Odd");
}
```

### 1. Switch, break, continue

```
switch (o) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            default:
                System.out.println(num1 * num2);
        }
```

---

# Loops

### 1. For Loop

```
for(int i=0; i<=5; i++){
    System.out.println(i);
}
```

### 2. While Loop

```
while (true){
    System.out.println("Infinite Loop");
}
```

### 3. Do-while Loop

```
do {
    System.out.println("Infinite Loop");
}
while (true)
```

---

# Functions

A function is a block of code that performs a specific task.

### Basic Syntax:

```
returnType (type para1, type para2, .....){
    // operation
}
```

---

# Time and Space Complexity

Time complexity of an algorithm quantifies the amount of time taken by an algorithm to run as a function of the length of the input.

## Types of notations

### 1. O-notation:

- It is used to denote asymptotic upper bound.
- For a given function g(n), we denote it by O(g(n)).
- Pronounced as “big-oh of g of n”.
- It is also known as worst case time complexity as it denotes the upper bound in which the algorithm terminates.

### 2. Ω-notation:

- It is used to denote asymptotic lower bound.
- For a given function g(n), we denote it by Ω(g(n)).
- Pronounced as “big-omega of g of n”.
- It is also known as best case time complexity as it denotes the lower bound in which the algorithm terminates.

### 3. 𝚯-notation:

- It is used to denote the average time of a program.

## Comparison of functions on the basis of time complexity

It follows the following order in case of time complexity:

```
O(n^n) > O(n!) > O(n3) > O(n2) > O(n.log(n)) > O(n.log(log(n))) > O(n) > O(sqrt(n)) > O(log(n)) > O(1)
```

Note: Reverse is the order for better performance of a code with corresponding time complexity, i.e. a program with less time complexity is more efficient.

## Space Complexity

- Space complexity of an algorithm quantifies the amount of time taken by a program to run as a function of length of the input.
- It is directly proportional to the largest memory your program acquires at any instance during run time.
- For example: int consumes 4 bytes of memory.
---

## Operators In Java

1. Unary Operator : ++, --, ~, !
2. Arithmetic Operator : +, -, *, /
3. Shift : >>, <<, >>>
4. Relational: <, >, >=, <=, !=
5. Bitwise Operator: &, |, ^
6. Logical Operator: &&, ||
7. Ternary Operator: ? :
8. Assignment Operator: = += -= *= /= %= &= ^= |= <<= >>= >>>=