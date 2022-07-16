# Stack (Last In First Out) [LIFO]

## Implementation Using Array

```
class Stack {
    int arr[];
    int top;
    int capacity;

    Stack(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return capacity == top + 1;
    }

    public void push(int item) {
        if (this.isFull()) {
            return;
        }
        arr[++top] = item;
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (this.isEmpty()) {
            return -1;
        }
        return arr[top];
    }
}
```

## Implementation Using Array List

```
import java.util.ArrayList;

class Stack {
    ArrayList<Integer> s = new ArrayList<Integer>();

    // isEmpty()
    public boolean isEmpty() {
        return s.isEmpty();
    }

    // push()
    public boolean push(int item) {
        return s.add(item);
    }

    // pop()
    public int pop() {
        if (this.isEmpty())
            return -1;
        return s.remove(s.size() - 1);
    }

    // peek()
    public int peek() {
        if (this.isEmpty())
            return -1;
        return s.get(s.size() - 1);
    }

}

```

## Implementation Using Linked List

```
class Node {
    int data;
    Node next;

    Node(int item) {
        this.data = item;
    }
}

class Stack {
    Node head;

    // utility function -> isEmpty()
    public boolean isEmpty() {
        return this.head == null;
    }

    // push
    public void push(int item) {
        if (this.isEmpty() == true) {
            this.head = new Node(item);
            return;
        }
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
    }

    // pop
    public void pop() {
        if (this.isEmpty() == true) {
            return;
        }
        head = head.next;
        return;
    }

    // peek
    public int peek() {
        if (this.isEmpty() == true) {
            return -1;
        }
        return head.data;
    }
}
```

## Implementation Using Collection Framework

```
import java.util.Stack;

public class CollectionFrameworkImplementation {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

```

### Question 1: Push an element at the bottom of the stack

```
 public static void pushBottom(int item, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(item);
            return;
        }
        int top = s.pop();
        pushBottom(item, s);
        s.push(top);
    }
```

### Question 2: Reverse the Stack

```
import java.util.Stack;

public class ReverseStack {
    public static void pushBottom(int item, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(item);
            return;
        }
        int top = s.pop();
        pushBottom(item, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverse(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

```
