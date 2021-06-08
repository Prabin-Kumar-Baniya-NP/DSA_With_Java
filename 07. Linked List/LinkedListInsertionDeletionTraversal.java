class Node{
  int data;
  Node next;
  Node (int item){
    this.data = item;
  }
}

class LinkedList{
  Node head;
  // For printing the elements of LinkedList
  public void printLinkedList(){
    Node iteratingNode = head;
    while (iteratingNode != null){
      System.out.println(iteratingNode.data);
      iteratingNode = iteratingNode.next;
    }
  }
  // inserting at the front
  public void insertionAtFront(int item){
    Node newNode = new Node(item);
    newNode.next = head;
    head = newNode;
  }
  // insertion at the enD
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
  // insertion after given Node
  public void insertionAfterNode(Node targetNode, int item){
    Node newNode = new Node(item);
    newNode.next = targetNode.next;
    targetNode.next = newNode;
  }
  // deleting head Node
  public void deleteHeadNode(){
    head = head.next;
    return ;
  }
  // deleting last Node
  public void deleteLastNode(){
    Node secondlastNode = head;
    while (secondlastNode.next.next != null){
      secondlastNode = secondlastNode.next;
    }
    secondlastNode.next = null;
  }
  // deleting a given Node
  public void deleteGivenNode(int item){
    Node previousNode = head;
    while (previousNode.next.data != item){
      previousNode = previousNode.next;
    }
    previousNode.next = previousNode.next.next;
  }
}
class LinkedListInsertionDeletionTraversal{
  public static void main(String args[]){
    LinkedList l = new LinkedList();
    l.head = new Node(1);
    l.head.next = new Node(2);
    Node secondNode = l.head.next;
    l.head.next.next = new Node(3);
    l.insertionAtFront(0);
    l.insertionAtEnd(4);
    l.insertionAfterNode(secondNode, 22);
    l.deleteHeadNode();
    l.deleteLastNode();
    l.deleteGivenNode(22);
    l.printLinkedList();
  }
}
