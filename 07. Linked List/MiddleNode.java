class Node{
  int data;
  Node next;
  Node(int item){
    data = item;
  }
}

class LinkedList{
  Node head;

  // method to push item in LinkedList
  public void push(int item){
    if (head == null){
      head = new Node(item);
      return ;
    }
    Node newNode = new Node(item);
    Node iteratingNode = head;
    while (iteratingNode.next != null){
      iteratingNode = iteratingNode.next;
    }
    iteratingNode.next = newNode;
  }
  // Traversal of LinkedList - Iterative approach
  public void printLinkedList(){
    Node iteratingNode = head;
    while (iteratingNode != null){
      System.out.println(iteratingNode.data);
      iteratingNode = iteratingNode.next;
    }
  }
  // find middle of LinkedList
  public void middleNode(){
    if(head == null){
      return ;
    }
    Node slowIterator = head;
    Node fastIterator = head;
    while (fastIterator != null && fastIterator.next != null){
      slowIterator = slowIterator.next;
      fastIterator = fastIterator.next.next;
    }
    System.out.println(slowIterator.data);
  }
}

class MiddleNode{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.push(1);
    l.push(2);
    l.push(3);
    l.push(4);
    l.push(5);
    l.middleNode();;
  }
}
