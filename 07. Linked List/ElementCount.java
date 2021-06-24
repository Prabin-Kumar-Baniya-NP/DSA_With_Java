// Write a function that counts the number of times a given int occurs in a Linked List
class Node{
  int data;
  Node next;
  Node(int item){
    this.data = item;
  }
}
class LinkedList{
  Node head;
  // function to count the occurence of given int in LinkedList
  public int count(int item, Node node, int counter){
    if(node == null){
      return counter;
    }
    if (node.data == item){
      return count(item, node.next, ++counter);
    }
    return count(item, node.next, counter);
  }
  // wrapper function for count
  public int countItem(int item){
    return count(item, head, 0);
  }
  // to print linkedList
  public void printLinkedList(){
    Node iteratingNode = head;
    while(iteratingNode != null){
      System.out.println(iteratingNode.data);
      iteratingNode = iteratingNode.next;
    }
  }
}
class ElementCount{
  public static void main(String args[]){
    LinkedList l = new LinkedList();
    l.head = new Node(1);
    l.head.next = new Node(2);
    l.head.next.next = new Node(3);
    l.head.next.next.next = new Node(1);
    l.head.next.next.next.next = new Node(1);
    System.out.println(l.countItem(1));
  }
}
