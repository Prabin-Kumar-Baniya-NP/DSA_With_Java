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

public class CircularQueueUsingArray {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.add(4);
        q.remove();
        q.add(5);
        q.remove();
        q.add(6);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
