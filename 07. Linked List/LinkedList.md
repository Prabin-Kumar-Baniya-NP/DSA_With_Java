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

## Detect Cycle in linked list

```
    public boolean detectCycle(){
        Node slowIterator = head;
        Node fastIterator = head;
        while(fastIterator != null && fastIterator.next != null){
            slowIterator = slowIterator.next;
            fastIterator = fastIterator.next.next;
            if (slowIterator == fastIterator)
                return true;
        }
        return false;
    }
```

## Make cycle in linked list

```
    public void makeCycle(int index){
        Node lastNode = head;
        Node targetNode = head;
        int count = 0;
        while(count != index && targetNode.next != null){
            targetNode = targetNode.next;
            count++;
        }
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = targetNode;
    }
```

## Remove cycle in linked list

```
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
            fastIterator = fastIterator.next;
        }
        fastIterator.next = null;
    }
```

## Length of Cycle in Linked List

```
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
```

## Middle Node of Linked List

```
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
```

## Nth Node from the end

```
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
    int targetNode = length - index;
    Node iteratingNode = head;
    while (targetNode > 0){
      iteratingNode = iteratingNode.next;
      targetNode--;
    }
    return iteratingNode.data;
  }
```

## Remove nth node from end

```
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
```

## Check Palindrome in Linked List

```
public Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node prevNode = head;
        Node currentNode = head.next;
        while(currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
        return head;
    }
    public Node getMiddleNode(Node head){
        Node slowIterator = head;
        Node fastIterator = head;
        while(fastIterator != null && fastIterator.next != null){
            slowIterator = slowIterator.next;
            fastIterator = fastIterator.next.next;
        }
        return slowIterator;
    }
    public boolean checkPalindrome(Node head){
        Node firstHalf = head;
        Node secondHalf = reverse(getMiddleNode(head));
        while(firstHalf != null && secondHalf != null){
            if (firstHalf.data != secondHalf.data){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
```
