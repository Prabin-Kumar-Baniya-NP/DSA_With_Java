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
