class Node{
  int data;
  Node next;
  Node(int item){
    this.data = item;
  }
}

class LinkedList{
  Node head;

  public void push(int item){
    if(head == null){
      head = new Node(item);
      return ;
    }
    Node newNode = new Node(item);
    Node lastNode = head;
    while (lastNode.next != null){
      lastNode = lastNode.next;
    }
    lastNode.next = newNode;
  }
  public void printLinkedList(){
    Node iteratingNode = head;
    while(iteratingNode != null){
      System.out.println(iteratingNode.data);
      iteratingNode = iteratingNode.next;
    }
  }
  public void makeCycle(int index){
    Node lastNode = head;
    Node targetNode = head;
    int count = 0;
    while (count!= index && targetNode.next != null){
      targetNode = targetNode.next;
      count++;
    }
    while (lastNode.next != null){
      lastNode = lastNode.next;
    }
    lastNode.next = targetNode;
  }
  public boolean detectCycle(){
    Node slowIterator = head;
    Node fastIterator = head;

    while(fastIterator != null && fastIterator.next != null){
      slowIterator = slowIterator.next;
      fastIterator = fastIterator.next.next;
      if (slowIterator == fastIterator){
        return true;
      }
    }
    return false;
  }
  public void removeCycle(){
    Node slowIterator = head;
    Node fastIterator = head;
    do{
      slowIterator = slowIterator.next;
      fastIterator = fastIterator.next.next;
    }
    while(slowIterator != fastIterator);

    slowIterator = head;
    while(slowIterator.next != fastIterator.next){
      slowIterator = slowIterator.next;
      fastIterator = fastIterator.next.next;
    }
    fastIterator.next = null;
  }
  public int lengthCycle(){
    Node slowIterator = head;
    Node fastIterator = head;
    int count = 0;
    do{
      slowIterator = slowIterator.next;
      fastIterator = fastIterator.next.next;
    }
    while(slowIterator != fastIterator);

    do{
      slowIterator = slowIterator.next;
      count = count + 1;
    }
    while(slowIterator != fastIterator);

    return count;
  }
}

class LinkedListCycle{
  public static void main(String args[]){
    LinkedList l = new LinkedList();
    l.push(0);
    l.push(1);
    l.push(2);
    l.push(3);
    l.push(4);
    l.push(5);
    l.push(6);
    l.push(7);
    l.push(8);
    l.push(9);
    l.push(10);
    l.push(11);
    l.makeCycle(5);
    System.out.println(l.detectCycle());
    System.out.println(l.lengthCycle());
    l.removeCycle();
    System.out.println(l.detectCycle());
  }
}
