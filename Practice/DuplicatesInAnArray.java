import java.util.Scanner;
import java.util.*;
class DuplicatesInAnArray{
  public static List findDuplicates(int size, int[] array){
    List<Integer> duplicates = new ArrayList<Integer>(size);
    for(int i = 0; i<size; i++){
      int targetIndex = array[i] % size;
      array[targetIndex] = array[targetIndex] + size;
    }
    for (int i=0; i<size; i++){
      if (array[i] >= size*2){
        duplicates.add(array[i]);
      }
    }
    if(duplicates.isEmpty() == true){
      duplicates.add(-1);
    }
    return duplicates;
  }
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int[] input = new int[size];
      for(int i=0; i<size; i++){
        input[i] = sc.nextInt();
      }
      System.out.println(findDuplicates(size, input));
  }
}
