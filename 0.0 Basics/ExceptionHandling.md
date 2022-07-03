# Exception Handling in Java

- Exception is an abnormal condition
- In Java, an exception is an event that disrupts the normal flow of the program.
- It is an object which is thrown at runtime.
- The core advantage of exception handling is to maintain the normal flow of the application.

---

## Types of Exception in Java

According to Oracle, there are three types of exceptions namely:

1. <b>Checked Exception</b> are those exception that are checked at compile time.
   Example: IOException, SQLException

2. <b>Unchecked Exception</b> are those exception that are checked at run-time.
   Example: ArrayIndexOutOfBoundsException

3. <b>Error</b> is irrecoverable.
   Example: OutOfMemoryError, VirtualMachineError, AssertionError etc.

---

## Java Exception Keywords

1. try

- The "try" keyword is used to specify a block where we should place an exception code.
- It means we can't use try block alone.
- The try block must be followed by either catch or finally.

2. catch

- The "catch" block is used to handle the exception.
- It must be preceded by try block which means we can't use catch block alone.
- It can be followed by finally block later.

  ```

  public static void main(String args[]){
  try{
  int data=100/0;
  }
  catch(ArithmeticException e){
  System.out.println(e);
  }
  }

  ```

3. finally

- The "finally" block is used to execute the necessary code of the program.
- It is executed whether an exception is handled or not.

4. Throw

- The "throw" keyword is used to throw an exception.

  ```
  public static void validate(int age) {
          if(age<18) {
              throw new ArithmeticException("Person is not eligible to vote");
          }
          else {
              System.out.println("Person is eligible to vote!!");
          }
      }
  ```

5. Throws

- The "throws" keyword is used to declare exceptions.

- It specifies that there may occur an exception in the method.

- It doesn't throw an exception.

- It is always used with method signature.

  ```
  class M{
      void method()throws IOException{
          throw new IOException("device error");
      }
  }
  ```

## Difference between throw and throws

1. Java throw keyword is used throw an exception explicitly in the code, inside the function or the block of code. While, Java throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code.

2. throw is used within the method. While, throws is used with the method signature.

3. We are allowed to throw only one exception at a time i.e. we cannot throw multiple exceptions. While, We can declare multiple exceptions using throws keyword that can be thrown by the method. For example, main() throws IOException, SQLException.

4. Throw keyword cannot propagate checked exceptions. While, throws keyword is used to propagate the checked Exceptions only.
