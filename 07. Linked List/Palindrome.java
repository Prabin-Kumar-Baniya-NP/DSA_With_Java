class Palindrome {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int item){
            this.data = item;
        }
        Node(int item, Node next){
            this.data = item;
            this.next = next;
        }
    }
    public void printLinkedList(){
        Node currentNode = this.head;
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
    public Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node prevNode = head;
        Node currentNode = head.next;
        while(currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
        return head;
    }
    public Node getMiddleNode(Node head){
        Node slowIterator = head;
        Node fastIterator = head;
        while(fastIterator != null && fastIterator.next != null){
            slowIterator = slowIterator.next;
            fastIterator = fastIterator.next.next;
        }
        return slowIterator;
    }
    public boolean checkPalindrome(Node head){
        Node firstHalf = head;
        Node secondHalf = reverse(getMiddleNode(head));
        while(firstHalf != null && secondHalf != null){
            if (firstHalf.data != secondHalf.data){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome ll = new Palindrome();
        ll.head = new Node(1);
        ll.head.next = new Node(1);
        ll.head.next.next = new Node(2);
        ll.head.next.next.next = new Node(2);
        ll.head.next.next.next.next = new Node(1);
        ll.head.next.next.next.next.next = new Node(1);
        ll.head = ll.reverse(ll.head);
        ll.printLinkedList();
        System.out.println(ll.checkPalindrome(ll.head));
    }
}
