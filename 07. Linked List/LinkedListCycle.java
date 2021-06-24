class Node{
  int data;
  Node next;
  Node(int item){
    this.data = item;
  }
}

class LinkedList{
  Node head;
  // make cycle in linkedList
  public void makeCycle(int index){
    int count = 0;
    Node lastNode = head;
    Node targetNode = head;
    while(lastNode != null && lastNode.next != null){
      lastNode = lastNode.next.next;
    }
    while(count != index){
      targetNode = targetNode.next;
      count++;
    }
    lastNode.next = targetNode.next;
  }
  // detect cycle in linkedList
  public boolean detectCycle(){
    Node fastIterator = head;
    Node slowIterator = head;

    while(fastIterator != null && fastIterator.next != null){
      fastIterator = fastIterator.next.next;
      slowIterator = slowIterator.next;
      if (fastIterator == slowIterator){
        return true;
      }
    }
    return false;
  }
  // remove cycle in linkedlist
  public void removeCycle(){
    Node fastIterator = head;
    Node slowIterator = head;
    while(fastIterator != slowIterator){
      fastIterator = fastIterator.next.next;
      slowIterator = slowIterator.next;
    }
    slowIterator = head;

    while(fastIterator.next != slowIterator.next){
      slowIterator = slowIterator.next;
      fastIterator = fastIterator.next.next;
    }
    fastIterator.next = null;
    return ;
  }
  // to push item in linkedList
  public void push(int item){
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
  // to print linkedlist
  public void printLinkedList(){
    Node iteratingNode = head;
    while(iteratingNode != null){
      System.out.println(iteratingNode.data);
      iteratingNode = iteratingNode.next;
    }
  }
}


class LinkedListCycle{
  public static void main(String args[]){
    LinkedList l = new LinkedList();
    // to push items in linkedList
    for(int i = 0; i <=10; i++){
      l.push(i);
    }
    l.printLinkedList();
    // to make cycle in linkedList
    l.makeCycle(5);
    // to detect cycle in linkedList
    System.out.println(l.detectCycle());
    // to remove cycle in linked List
    l.removeCycle();
    // again check for cycle
    System.out.println(l.detectCycle());
  }

}
