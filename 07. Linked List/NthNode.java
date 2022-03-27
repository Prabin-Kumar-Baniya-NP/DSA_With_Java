class Node{
  int data;
  Node next;
  Node(int item){
    this.data = item;
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
  // method which finds the nth node and return the item at that node
  public int findNthNodeItem(int index){
    Node iteratingNode = head;
    int count = 0;
    while (iteratingNode != null){
      if (count == index){
        return iteratingNode.data;
      }
      else{
        count++;
        iteratingNode = iteratingNode.next;
      }
    }
    return -1;
  }
  // find nth node from the end of Linked List
  // Approach - First find total no of nodes then substract it with given index
  // to find the target node and print the item in that target Node
  public int count(){
    Node iteratingNode = head;
    int count = 0;
    while (iteratingNode != null){
      count++;
      iteratingNode = iteratingNode.next;
    }
    return count;
  }
  public int getNthNodeFromEnd(int index){
    int length = this.count();
    int targetNode = (length - index) -1;
    Node iteratingNode = head;
    while (targetNode > 0){
      iteratingNode = iteratingNode.next;
      targetNode--;
    }
    return iteratingNode.data;
  }
  public Node removeNthNodeFromEnd(Node head, int n){
    if (head.next == null){
        return null;
    }
    int size = 0;
    Node currentNode = head;
    while(currentNode != null){
        currentNode = currentNode.next;
        size++;
    }
    if(n == size){
        return head.next;
    }
    int targetIndex = size-n-1;
    currentNode = head;
    int i=0;
    while(i < targetIndex){
        currentNode = currentNode.next;
        i++;
    }
    currentNode.next = currentNode.next.next;
    return head;

}
}
class NthNode{
  public static void main(String args[]){
      LinkedList l = new LinkedList();
      l.push(1);
      l.push(2);
      l.push(3);
      l.push(4);
      l.push(5);
      l.push(6);
      l.push(7);
      l.push(8);
      System.out.println(l.findNthNodeItem(2)); // Prints 3
      System.out.println(l.getNthNodeFromEnd(0)); // Prints 8
      System.out.println(l.getNthNodeFromEnd(1)); // Prints 7
      System.out.println(l.getNthNodeFromEnd(2)); // Prints 6
      System.out.println(l.getNthNodeFromEnd(3)); // Prints 5
  }
}
