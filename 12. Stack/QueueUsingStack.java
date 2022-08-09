import java.util.Stack;

class Queue1 {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    public boolean isEmpty() {
        return s1.isEmpty();
    }

    public void add(int item) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(item);
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

class Queue2 {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    public boolean isEmpty() {
        return s1.isEmpty();
    }

    public void add(int item) {
        s1.push(item);
    }

    public int peek() {
        if (isEmpty())
            return -1;
        return s1.peek();
    }
}

public class QueueUsingStack {
    public static void main(String[] args) {
        Queue1 q = new Queue1();
        q.add(1);
        q.add(2);
        q.remove();
        q.remove();
        q.add(3);
        System.out.println(q.peek());
    }
}
