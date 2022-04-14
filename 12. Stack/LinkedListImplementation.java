class LinkedListImplementation{
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
    }
    public static void main(String[] args) {
        Stack s = new Stack();
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