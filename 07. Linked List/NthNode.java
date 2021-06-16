class Node{
  int data;
  Node next;
  Node(int item){
    this.data = item;
  }
}
class LinkedList{
  Node head;

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
}
class NthNode{
  public static void main(String args[]){
      LinkedList l = new LinkedList();
      l.head = new Node(1);
      l.head.next = new Node(2);
      l.head.next.next = new Node(3);
      l.head.next.next.next = new Node(4);
      System.out.println(l.findNthNodeItem(2)); // Prints 3
  }
}
