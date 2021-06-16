// LinkedList- Traversal, Count, Search
class Node{
  int data;
  Node next;

  Node (int item){
    this.data = item;
  }
}
class LinkedList{
  Node head;
  // Traversal of LinkedList - Iterative approach
  public void printLinkedList(){
    Node iteratingNode = head;
    while (iteratingNode != null){
      System.out.println(iteratingNode.data);
      iteratingNode = iteratingNode.next;
    }
  }
  // Traversal of LinkedList - Recursive approach
  public Node executeTraversalRecursively(Node node){
    if (node == null){
      return node;
    }
    System.out.println(node.data);
    return executeTraversalRecursively(node.next);
  }
  public void printLinkedListRecursiveApproach(){
      executeTraversalRecursively(this.head);
      return ;
  }
  // Count the total number of nodes - Iterative approach
  public void printcount(){
    Node iteratingNode = head;
    int count = 0;
    while (iteratingNode != null){
      count++;
      iteratingNode = iteratingNode.next;
    }
    System.out.println(count);
    return ;
  }
  // Count the total number of nodes - Recursive approach
  public int executeCountRecursively(Node node){
    if (node == null){
      return 0;
    }
    return 1 + executeCountRecursively(node.next);
  }
  public void printcountRecursiveApproach(){
    System.out.println(executeCountRecursively(head));
    return ;
  }
  // Check whether the given item is present in LinkedList - Iterative Approach
  public boolean checkItemIteratively(int item){
    Node iteratingNode = head;
    while (iteratingNode != null){
      if (iteratingNode.data == item){
        return true;
      }
      iteratingNode = iteratingNode.next;
    }
    return false;
  }
  // Check whether the given item is present in LinkedList - Recursive approach
  public boolean executeSearchRecursively(Node node, int item){
    if (node == null){
      return false;
    }
    if (node.data == item){
      return true;
    }
    else{
        return executeSearchRecursively(node.next, item);
    }
  }
  public boolean checkItemRecursively(int item){
    return executeSearchRecursively(head, item);
  }
}
class TraversalCountSearch{
  public static void main(String args[]){
    LinkedList l = new LinkedList();
    l.head = new Node(1);
    l.head.next = new Node(2);
    l.head.next.next = new Node(3);
    System.out.println("Printing LinkedList - Iterative Approach");
    l.printLinkedList();
    System.out.println("Printing LinkedList - Recursive Approach");
    l.printLinkedListRecursiveApproach();
    System.out.println("Counting LinkedList - Iterative Approach");
    l.printcount();
    System.out.println("Counting LinkedList - Recursive Approach");
    l.printcountRecursiveApproach();
    System.out.println("Checking 1, 11 in LinkedList - Iterative Approach");
    System.out.println(l.checkItemIteratively(1));
    System.out.println(l.checkItemIteratively(11));
    System.out.println("Checking 1, 11 in LinkedList - Recursive Approach");
    System.out.println(l.checkItemRecursively(1));
    System.out.println(l.checkItemRecursively(11));
  }
}
