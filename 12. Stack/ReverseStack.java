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
