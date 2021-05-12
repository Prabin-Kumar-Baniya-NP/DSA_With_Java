class LinkedList{
  Node head;
  // class representing Node
  static class Node{
    int data;
    Node next;
    Node (int d){
      this.data = d;
    }
  }
  // Traversing a LinkedList
  public void printLinkedList(){
    Node iteratingNode = head;
    while(iteratingNode != null){
      System.out.print(iteratingNode.data + " ");
      iteratingNode = iteratingNode.next;
    }
  }
  public static void main(String args[]){
    LinkedList list1 = new LinkedList();
    list1.head = new Node(1);
    Node secondNode = new Node(2);
    Node thirdNode = new Node(3);
    list1.head.next = secondNode;
    secondNode.next = thirdNode;
    System.out.println(list1.head.data); // 1
    System.out.println(list1.head.next.data); // 2
    System.out.println(list1.head.next.next.data); // 3
    System.out.println(list1.head.next.next.next); // null
    list1.printLinkedList();
  }
}
