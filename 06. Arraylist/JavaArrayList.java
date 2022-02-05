
/*
Note:
1. Array has fixed memory size. But arraylist has dynamic memory allocation.
2. In array, we can store primitive datatypes and objects. But in arraylist, we can store only objects, no primitive data types.

*/
import java.util.*;

class JavaArrayList {
  public static void main(String args[]) {
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    List<String> list2 = new ArrayList<String>();
    Collection<Integer> list3 = new ArrayList<Integer>();
    Collection<String> list4 = new ArrayList<String>();
    // add
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list2.add("Apple");
    list2.add("Banana");
    list2.add("Mango");
    list3.add(11);
    list3.add(12);
    list3.add(13);
    list4.add("America");
    list4.add("UK");
    list4.add("France");
    list1.add(0, 4);
    list1.add(0, 5);
    list1.add(0, 6);
    list2.add(0, "Pineappple");
    list2.add(1, "Papaya");
    list2.add(3, "Watermelon");
    // addAll
    list3.addAll(list1);
    list4.addAll(list2);
    // remove
    list3.remove(13);
    list4.remove("UK");
    // removeAll
    list3.removeAll(list1);
    list4.removeAll(list2);
    // clear
    list4.clear();
    // contains
    System.out.println(list1.contains(1));
    System.out.println(list2.contains("Apple"));
    // containsAll
    System.out.println(list3.containsAll(list1));
    System.out.println(list4.containsAll(list2));
    // equals
    System.out.println(list1.equals(list1));
    // hashcode
    System.out.println(list1.hashCode());
    // isEmpty
    System.out.println(list4.isEmpty());
    // size
    System.out.println(list1.size());
    // toArray();
    System.out.println(list1.toArray());
    // iterator
    System.out.println(list1.iterator());
    // spliterator
    System.out.println(list1.spliterator());
    // get()
    System.out.println(list1.get(0));
    // indexOf()
    list1.add(6);
    System.out.println(list1.indexOf(6));
    System.out.println(list1.lastIndexOf(6));
    // listIterator()
    System.out.println(list1.listIterator());
    // set()
    list1.set(0, 66);
    // sort()
    Collections.sort(list1);
    Collections.sort(list1, Collections.reverseOrder());
    // subList()
    System.out.println(list1.subList(2, 4));
    // forEach()
    System.out.println("List4");
    for (String item : list4) {
      System.out.print(item + " ");
    }
    // Printing All ArrayList
    System.out.println(list1);
    System.out.println(list2);
    System.out.println(list3);
    System.out.println(list4);
  }
}
