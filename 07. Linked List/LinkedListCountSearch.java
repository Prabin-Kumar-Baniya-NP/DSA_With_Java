class Node{
  int data;
  Node next;
  Node(int item){
    this.data = item;
  }
}

class LinkedList{
  Node head;
  // iterative approach to count LinkedList
  public int getcountOfLinkedList(){
    int count = 0;
    Node iteratingNode = head;
    while (iteratingNode != null){
      count += 1;
      iteratingNode = iteratingNode.next;
    }
    return count;
  }
  // recursive approach to count LinkedList
  public int countLinkedListRecursively(Node node){
    if (node == null){
      return 0;
    }
    return 1 + countLinkedListRecursively(node.next);
  }
  // wrapper for countLinkedListRecursively
  public int getCountOfLinkedListRecursively(){
    return countLinkedListRecursively(head);
  }

  // searching an element in LinkedList and returning true if found otherwise false
  // Iterative approach
  public boolean searchLinkedList(int item){
    Node iteratingNode = head;
    while (iteratingNode != null){
      if (iteratingNode.data == item)
        return true;
      iteratingNode = iteratingNode.next;
    }
    return false;
  }
  // Recursive approach
  public boolean searchLinkedListRecursively(Node node, int item){
    if (node == null){
      return false;
    }
    if (node.data == item)
      return true;
    return searchLinkedListRecursively(node.next, item);
  }
}

class LinkedListCountSearch{
  public static void main(String args[]){
    LinkedList l = new LinkedList();
    l.head = new Node(1);
    l.head.next = new Node(2);
    l.head.next.next = new Node(3);
    System.out.println(l.getcountOfLinkedList());
    System.out.println(l.getCountOfLinkedListRecursively());
    System.out.println(l.searchLinkedList(22));
    System.out.println(l.searchLinkedListRecursively(l.head, 2));
  }
}
