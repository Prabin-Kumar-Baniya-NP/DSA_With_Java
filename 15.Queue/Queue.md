# Queue - FIFO [First In First Out]

## Queue Using Array

```
class Queue {
    int arr[];
    int size;
    // rear = -1, front will be always 0 index in case of array
    int rear = -1;

    Queue(int size) {
        arr = new int[size];
        this.size = size;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    // enqueue - O(1)
    public void add(int item) {
        if (this.rear == this.size - 1)
            return;
        arr[++rear] = item;
    }

    // dequeue - O(n)
    public int remove() {
        if (this.isEmpty())
            return -1;

        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    // peek
    public int peek() {
        if (this.isEmpty())
            return -1;

        return arr[0];
    }
}
```

## Circular Queue Using Array

- A Circular Queue is a special version of queue where the last element of the queue is connected to the first element of the queue forming a circle.

```
class CircularQueue {
    int arr[];
    int size;
    int front = -1;
    int rear = -1;

    CircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
    }

    public boolean isEmpty() {
        return this.front == -1 && this.rear == -1;
    }

    public boolean isFull() {
        return (this.rear + 1) % size == this.front;
    }

    // enqueue - O(1)
    public void add(int item) {
        if (this.isFull())
            return;
        // 1st element add
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = item;
    }

    // dequeue - O(1)
    public int remove() {
        if (isEmpty())
            return -1;
        int data = arr[front];
        if (rear == front) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return data;
    }

    // peek
    public int peek() {
        if (isEmpty())
            return -1;
        return arr[front];
    }
}
```

Note:

1. Enqueue

   - O(1) for queue using array
   - O(1) for circular queue using array

2. Dequeue
   - O(N) for queue using array
   - O(1) for circular queue using array

## Queue Using Linked List

```
class Node {
    int data;
    Node next;

    Node(int item) {
        this.data = item;
    }
}

class LinkedListQueue {
    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    // enqueue - O(1)
    public void add(int item) {
        Node newNode = new Node(item);
        // for first element
        if (tail == null) {
            head = tail = newNode;
        }
        // for rest of the elements insertion
        tail.next = newNode;
        tail = newNode;
        return;
    }

    // dequeue - O(1)
    public int remove() {
        if (isEmpty()) {
            return -1;
        }
        int front = head.data;
        if (head == tail) {
            tail = null;
        }
        head = head.next;
        return front;
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }
}
```

## Queue using Collection Framework

![Collection Framework](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)

```
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingCollection {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new ArrayDeque<Integer>();
        // Since queue is an interface so, we cant create object using queue
        // LinkedList and ArrayDequeue implements Queue so, use any one of this,
        // Both works almost same
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.remove();
        q1.remove();
        q1.remove();
        q1.add(4);
        q1.add(5);
        q1.add(6);

        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
```

## Queue using Stack

- Two Approach
  - Push - O(n), Pop - O(1) => Front (Stack Top), Rear (Stack Bottom)
  - Pop - O(n), Peek - O(n) => Front (Stack Bottom), Rear (Stack Top)

### Push - O(n), Pop - O(1)

```
import java.util.Stack;

class Queue {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    public boolean isEmpty() {
        return s1.isEmpty();
    }

    public void add(int item) {
        // Move all s1 elements to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        // Put item in s1
        s1.push(item);
        // Move all s2 elements to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int remove() {
        if (isEmpty())
            return -1;
        return s1.pop();
    }

    public int peek() {
        if (isEmpty())
            return -1;
        return s1.peek();
    }
}
```

### Pop - O(n), Peek - O(n)

```
class Queue {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    public boolean isEmpty() {
        return s1.isEmpty();
    }

    public void add(int item) {
        s1.push(item);
        return;
    }

    public int remove() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int removedItem = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return removedItem;
    }

    public int peek() {
        if (s1.isEmpty()) {
            return -1;
        }
        int front = -1;
        while(!s1.isEmpty()){
            front = s1.pop();
        }
        return front;
    }
}
```

## Dequeue

- Deque or Double Ended Queue is a generalized version of Queue data structure that allows insert and delete at both ends.

- Operations on Deque: Mainly the following four basic operations are performed on queue:

  - insertFront(): Adds an item at the front of Deque.
  - insertLast(): Adds an item at the rear of Deque.
  - deleteFront(): Deletes an item from the front of Deque.
  - deleteLast(): Deletes an item from the rear of Deque.
  - getFront(): Gets the front item from the queue.
  - getRear(): Gets the last item from queue.
  - isEmpty(): Checks whether Deque is empty or not.
  - isFull(): Checks whether Deque is full or not.

- Application:
  - Applied as both stack and queue, as it supports both operations.
  - Storing a web browser’s history.
  - Storing a software application’s list of undo operations.
  - Job scheduling algorithm

### Dequeue using Collection Framework - ArrayDequeue

```
import java.util.ArrayDeque;

public class Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<Integer>();
        q.addFirst(1);
        q.addLast(2);
        q.removeFirst();
        q.removeLast();
        q.addFirst(12);
        q.addLast(22);
        System.out.println(q.getFirst());
        System.out.println(q.getLast());
    }
}
```
