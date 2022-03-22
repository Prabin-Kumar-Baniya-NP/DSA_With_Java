class ReeverseLinkedList{
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int e){
            this.data = e;
            this.next = null;
        }
    }
    // Traverse the linked list
    public void printLinkedList(){
        Node iteratingNode = head;
        while(iteratingNode != null){
            System.out.println(iteratingNode.data);
            iteratingNode = iteratingNode.next;
        }
    }
    // Insert element at end
    public void insertAtEnd(int item){
        Node iteratingNode = head;
        while(iteratingNode.next != null){
            iteratingNode = iteratingNode.next;
        }
        iteratingNode.next = new Node(item);
    }
    // Reverse Iterate
    public void reverseIterate(){
        if(head == null || head.next == null){
            return ;
        }

        Node prevNode = head;
        Node currentNode = head.next;
        while(currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            // update
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    // Reverse Recursively
    public Node reverseRecursively(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        ReeverseLinkedList ll = new ReeverseLinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);
        ll.insertAtEnd(8);
        ll.head = ll.reverseRecursively(ll.head);
        ll.printLinkedList();
    }
}