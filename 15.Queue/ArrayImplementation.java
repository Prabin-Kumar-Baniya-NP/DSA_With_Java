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

class ArrayImplementation {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.remove();
        q.add(3);
        q.add(4);
        q.remove();
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}