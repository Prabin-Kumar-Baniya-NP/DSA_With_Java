# Linked List

- Variable Size
- Non-contiguous memory

## ArrayList vs Linked List

- Array List Insert = O(n)
- LinkedList Insert = O(1)

- Array List Search = O(1)
- LinkedList Search = O(n)

## Types of Linked List

1. Singular
2. Double
3. Circular

## Liked List in Java

```
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
  public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        System.out.println(ll.head.data);
        System.out.println(ll.head.next.data);
        System.out.println(ll.head.next.next.data);
        ll.printLinkedList();
    }
}

```

## Traversing the Linked List

```
public void printLinkedList(){
    Node iteratingNode = head;
    while(iteratingNode != null){
      System.out.print(iteratingNode.data + " ");
      iteratingNode = iteratingNode.next;
    }
  }
```

## Insertion in Linked List

- Inserting at front

```
public void insertAtFront(int item){
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
    }
```

- Insertion at End

```
public void insertAtEnd(int item){
        if (head == null){
            head = new Node(item);
            return ;
        }
        Node newNode = new Node(item);
        Node iteratingNode = head;
        while(iteratingNode.next != null){
            iteratingNode = iteratingNode.next;
        }
        iteratingNode.next = newNode;
    }
```

## Deletion in Linked List

- Deletion at Front

```
public void deleteAtFront(){
        head = head.next;
        return ;
    }
```

- Deletion at End

```
public void deleteAtEnd(){
        Node iteratingNode = head;
        while(iteratingNode.next.next != null){
            iteratingNode = iteratingNode.next;
        }
        iteratingNode.next = null;
    }
```

## Reverse The Linked List

### Iterative Approach

```
public void reverseIterate(){
      if(head == null || head.next == null){
          return ;
      }
      Node prevNode = head;
      Node currentNode = head.next;
      while(currentNode != null){
          Node nextNode = currentNode.next;
          currentNode.next = prevNode;

          // update
          prevNode = currentNode;
          currentNode = nextNode;
      }
      head.next = null;
      head = prevNode;
  }
```

### Recursive Approach

```
    public Node reverseRecursively(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
```
