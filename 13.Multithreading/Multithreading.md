# Multithreading in Java

- A thread is a light-weight sub-process.

- We use multithreading than multiprocessing because threads use a shared memory area.

  - They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.

- If there occurs exception in one thread, it doesn't affect other threads.

## Multi-tasking

- Multitasking is a process of executing multiple tasks simultaneously.

- We use multitasking to utilize the CPU.

- Multitasking can be achieved in two ways:
  - Process-based Multitasking (Multiprocessing)
  - Thread-based Multitasking (Multithreading)

## Life-Cycle of thread in Java

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

## Creating a Thread

- Threads can be created by using two mechanisms :

  - Extending the Thread class
  - Implementing the Runnable Interface

- Example:

  ```

  class MultithreadingDemoOne extends Thread {
      public void run() {
          try {
              System.out.println("Thread " + Thread.currentThread().getId() + " is running");
          } catch (Exception e) {
              System.out.println("Exception is caught");
          }
      }
  }

  class MultithreadingDemoTwo implements Runnable {
      public void run() {
          try {
              System.out.println("Thread " + Thread.currentThread().getId() + " is running");
          } catch (Exception e) {
              System.out.println("Exception is caught");
          }
      }
  }

  public class ThreadingBasics {
      public static void main(String[] args) {

    // Case 1: Extending the thread class
          MultithreadingDemoOne object1 = new MultithreadingDemoOne();
          object1.start();

    // Case 2: Implementing the Runnable interface

          MultithreadingDemoTwo t1 = new MultithreadingDemoTwo();

          // Create an instance of the Thread class and pass your Runnable object to its constructor as a parameter.
          Thread object2 = new Thread(t1); // A Thread object is created that can run your Runnable class.

          // Call the Thread object’s start method.
          object2.start(); // The run method of your Runnable object is called and executes in a separate thread.

      }
  }
  ```

### Thread Class vs Runnable Interface

- If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance. But, if we implement the Runnable interface, our class can still extend other base classes.

- We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt methods like yield(), interrupt() etc. that are not available in Runnable interface.

- Using runnable will give you an object that can be shared amongst multiple threads.

### Thread Scheduler

- A component of Java that decides which thread to run or execute and which thread to wait is called a thread scheduler in Java.
- In Java, a thread is only chosen by a thread scheduler if it is in the runnable state.
- However, if there is more than one thread in the runnable state, it is up to the thread scheduler to pick one of the threads and ignore the other ones.
- There are some criteria that decide which thread will execute first.
- There are two factors for scheduling a thread i.e. Priority and Time of arrival.

  - Priority: Priority of each thread lies between 1 to 10. If a thread has a higher priority, it means that thread has got a better chance of getting picked up by the thread scheduler.

  - Time of Arrival: Suppose two threads of the same priority enter the runnable state, then priority cannot be the factor to pick a thread from these two threads. In such a case, arrival time of thread is considered by the thread scheduler. A thread that arrived first gets the preference over the other threads.

- Thread Scheduler Algorithms:
  - First Come First Serve Scheduling
  - Time-slicing scheduling
  - Preemptive-Priority Scheduling

### Sleep

```

class ThreadSleep extends Thread{
    public void run(){
        try{
            System.out.println("I am going to sleep for 5 seconds");
            Thread.sleep(5000);
            System.out.println("I slept for 5 seconds");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}


public class Sleep {
    public static void main(String[] args) {
        ThreadSleep obj = new ThreadSleep();
        obj.start();
    }
}

```

### Can we start a thread twice ?

- No. After starting a thread, it can never be started again.
- If you does so, an IllegalThreadStateException is thrown. In such case, thread will run once but for second time, it will throw exception.

### What if we call Java run() method directly instead start() method ?

- Each thread starts in a separate call stack.

- Invoking the run() method from the main thread, the run() method goes onto the current call stack rather than at the beginning of a new call stack.

### Join method in Java

- The join() method in Java is provided by the java.lang.Thread class that permits one thread to wait until the other thread to finish its execution.

- Suppose th be the object the class Thread whose thread is doing its execution currently, then the th.join(); statement ensures that th is finished before the program does the execution of the next statement.

- It has a void type and throws InterruptedException.

- Joining threads in Java has three functions namely,
  - join() : Waits for this thread to die
  - join(long millis) : Waits at most millis milliseconds for this thread to die
  - join(long millis, int nanos) : Waits at most millis milliseconds plus nano nanoseconds for this thread to die

### Naming a thread

- Using setName() Method: t1.setName("My Thread");

- Without Using setName() Method:

  ```
  class ThreadName extends Thread  {
    ThreadName(String threadName){
      super(threadName);
    }

    public void run(){
      System.out.println(" The thread is executing....");
    }
  }
  ```

  ```
  ThreadName th1 = new ThreadName("My Thread");
  ```

### Thread Priority

- Each thread has a priority. Priorities are represented by a number between 1 and 10.

- In most cases, the thread scheduler schedules the threads according to their priority (known as preemptive scheduling).

- But it is not guaranteed because it depends on JVM specification that which scheduling it chooses.

### Daemon Thread

- Daemon thread in Java is a service provider thread that provides services to user threads for background supporting tasks.

- Its life depend on the mercy of user threads i.e. when all the user threads dies, JVM terminates this thread automatically.

- It is a low priority thread.

- Methods:

  - public void setDaemon(boolean status): is used to mark the current thread as daemon thread or user thread.

    ```
    class TestDaemonThread2 extends Thread{
    public void run(){
      System.out.println("Name: "+Thread.currentThread().getName());
      System.out.println("Daemon: "+Thread.currentThread().isDaemon());
    }

    public static void main(String[] args){
      TestDaemonThread2 t1=new TestDaemonThread2();
      TestDaemonThread2 t2=new TestDaemonThread2();
      t1.start();
      t1.setDaemon(true);//will throw exception here
      t2.start();
    }
    }
    ```

  - public boolean isDaemon(): is used to check that current is daemon.

---

## Java Thread Pool:

### Introduction

- Java Thread pool represents a group of worker threads that are waiting for the job and reused many times.

- In the case of a thread pool, a group of fixed-size threads is created.

- A thread from the thread pool is pulled out and assigned a job by the service provider.

- After completion of the job, the thread is contained in the thread pool again.

- It saves time because there is no need to create a new thread.

- It is used in Servlet and JSP where the container creates a thread pool to process the request.

### Risks involved in Thread Pool:

- Deadlock:

  - It is a known fact that deadlock can come in any program that involves multithreading, and a thread pool introduces another scenario of deadlock.
  - Consider a scenario where all the threads that are executing are waiting for the results from the threads that are blocked and waiting in the queue because of the non-availability of threads for the execution.

- Thread Leakage:

  - Leakage of threads occurs when a thread is being removed from the pool to execute a task but is not returning to it after the completion of the task.
  - For example, when a thread throws the exception and the pool class is not able to catch this exception, then the thread exits and reduces the thread pool size by 1. If the same thing repeats a number of times, then there are fair chances that the pool will become empty, and hence, there are no threads available in the pool for executing other requests.

- Resource Thrashing:
  - A lot of time is wasted in context switching among threads when the size of the thread pool is very large.
  - Whenever there are more threads than the optimal number may cause the starvation problem, and it leads to resource thrashing.

---

## Garbage Collection

### Introduction

- In java, garbage means unreferenced objects.

- Garbage Collection is process of reclaiming the runtime unused memory automatically.

- In other words, it is a way to destroy the unused objects.

- To do so, we were using free() function in C language and delete() in C++. But, in java it is performed automatically. So, java provides better memory management.

### Advantages

- It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
- It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.

### How can the object be unreferenced ?

- By nulling the reference

  ```
  Employee e=new Employee();
  e=null;
  ```

- By assigning a reference to another

  ```
  Employee e1=new Employee();
  Employee e2=new Employee();
  e1=e2;//now the first object referred by e1 is available for garbage collection
  ```

- By anonymous object etc.
  ```
  new Employee();
  ```

---

## Java Synchronization

### Introduction

- Synchronization in Java is the capability to control the access of multiple threads to any shared resource.

- The synchronization is mainly used to

  - To prevent thread interference.
  - To prevent consistency problem.

- There are two types of synchronization

  - Process Synchronization
  - Thread Synchronization

### Thread Synchronization

- There are two types of thread synchronization mutual exclusive and inter-thread communication.

- Mutual Exclusive:
  - Mutual Exclusive helps keep threads from interfering with one another while sharing data.
  - It can be achieved by using the following three ways:
    - By Using Synchronized Method
    - By Using Synchronized Block
    - By Using Static Synchronization

### Concept of Lock in Java

- Synchronization is built around an internal entity known as the lock or monitor.
- Every object has a lock associated with it.
- By convention, a thread that needs consistent access to an object's fields has to acquire the object's lock before accessing them, and then release the lock when it's done with them.

### Mutual Exclusive : Synchronized Method

- If you declare any method as synchronized, it is known as synchronized method.

- Synchronized method is used to lock an object for any shared resource.

- When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task.

### Mutual Exclusive : Synchronized Block

- Synchronized block can be used to perform synchronization on any specific resource of the method.

- Suppose we have 50 lines of code in our method, but we want to synchronize only 5 lines, in such cases, we can use synchronized block.

- If we put all the codes of the method in the synchronized block, it will work same as the synchronized method.

- A Java synchronized block doesn't allow more than one JVM, to provide access control to a shared resource.

- The system performance may degrade because of the slower working of synchronized keyword.

- Java synchronized block is more efficient than Java synchronized method.

### Mutual Exclusive: Static Synchronization

- If you make any static method as synchronized, the lock will be on the class not on object.

- Suppose there are two objects of a shared class (e.g. Table) named object1 and object2.
  - In case of synchronized method and synchronized block there cannot be interference between t1 and t2 or t3 and t4 because t1 and t2 both refers to a common object that have a single lock.
  - But there can be interference between t1 and t3 or t2 and t4 because t1 acquires another lock and t3 acquires another lock.
  - We don't want interference between t1 and t3 or t2 and t4. Static synchronization solves this problem.

### Inter-thread Communication

- Inter-thread communication or Co-operation is all about allowing synchronized threads to communicate with each other.

- Cooperation (Inter-thread communication) is a mechanism in which a thread is paused running in its critical section and another thread is allowed to enter (or lock) in the same critical section to be executed.

- It is implemented by following methods of Object class:
  - wait():
    - The wait() method causes current thread to release the lock and wait until either another thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.
  - notify():
    - The notify() method wakes up a single thread that is waiting on this object's monitor.
    - If any threads are waiting on this object, one of them is chosen to be awakened.
    - The choice is arbitrary and occurs at the discretion of the implementation.
  - notifyAll()
    - Wakes up all threads that are waiting on this object's monitor.
