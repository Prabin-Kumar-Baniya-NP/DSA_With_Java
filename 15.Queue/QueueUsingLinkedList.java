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

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        LinkedListQueue q = new LinkedListQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.remove();
        q.remove();
        q.add(4);
        q.add(5);
        q.add(6);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
