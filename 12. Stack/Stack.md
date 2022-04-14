# Stack (Last In First Out) [LIFO]

## Implementation Using Linked List

```
static class Node{
        int data;
        Node next;
        Node(int item){
            this.data = item;
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int item){
            if(isEmpty()){
                head = new Node(item);
                return ;
            }
            Node newNode = new Node(item);
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
```

## Implementation Using Array List

```
import java.util.ArrayList;

public class ArrayListImplementation {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int item) {
            list.add(item);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
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
