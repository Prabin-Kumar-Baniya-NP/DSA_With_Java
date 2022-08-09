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
