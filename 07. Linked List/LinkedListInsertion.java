class Node{
  int data;
  Node next;
  Node(int item){
    this.data = item;
  }
}

class LinkedList{
  Node head;

  public void printLinkedList(){
    Node iteratingNode = head;
    while (iteratingNode != null){
      System.out.println(iteratingNode.data);
      iteratingNode = iteratingNode.next;
    }
  }
  // Insertion At front
  public void insertionAtFront(int item){
    Node newNode = new Node(item);
    newNode.next = head;
    head = newNode;
  }
  // Insetion At end
  public void insertionAtEnd(int item){
    Node newNode = new Node(item);
    if (head == null){
      head = new Node(item);
      return ;
    }
    Node lastNode = head;
    while (lastNode.next != null){
      lastNode = lastNode.next;
    }
    lastNode.next = newNode;
  }
  // Insertion at given position
  public void insertionAfterNode(Node targetNode, int item){
    Node newNode = new Node(item);
    if (targetNode == null){
      System.out.println("Target Node cant be null");
      return ;
    }
    newNode.next = targetNode.next;
    targetNode.next = newNode;
  }
}

class PracticeProgram{
  public static void main(String args[]){
    LinkedList ll = new LinkedList();
    ll.head = new Node(1);
    ll.head.next = new Node(2);
    Node secondNode = ll.head.next;
    ll.head.next.next = new Node(3);
    ll.head.next.next.next = new Node(4);
    ll.printLinkedList();
    System.out.println("Inserting 0 at front");
    ll.insertionAtFront(0);
    ll.printLinkedList();
    System.out.println("Inserting 5 at end");
    ll.insertionAtEnd(5);
    ll.printLinkedList();
    System.out.println("Inserting 22 after second node");
    ll.insertionAfterNode(secondNode, 22);
    ll.printLinkedList();
  }
}
