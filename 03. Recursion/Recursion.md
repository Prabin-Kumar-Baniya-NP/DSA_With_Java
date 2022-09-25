# Recursion Practice Problems

<b>Begineer Level Questions</b>

1. Print Numbers in Increasing and Decreasing Order
2. Sum of N natural numbers
3. Factorial of Number
4. Fibonacci Numbers
5. Power of Number (with stack height = n and log(n))

<b>Intermediate Level Questions</b>

1. Tower of Hanoi
2. Reverse the String
3. First and Last occurrence of an element using recursion.
4. Check if an array is sorted (strictly increasing) - O(n)
5. Move all ‘x’ to the end of the string. - O(n)
6. Remove Duplicates in a String
7. Subsequences of String
8. Unique Subsequences of String

<b>Advanced Level Questions</b>

1. Permutation of String
2. Count Total Path in a Maze
3. Tiling Problems
4. Friends Pairing Problems
5. Subsets of Set

---

## Level 1 - Begineers [5 Questions]

### 1. Print Numbers in Increasing and Decreasing Order

```
class PrintNumbers {
    public static void printNum(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num); // Prints 5 4 3 2 1
        printNum(num - 1);
        System.out.println(num); // Prints 1 2 3 4 5
    }

    public static void main(String[] args) {
        printNum(5);
    }
}

```

### 2. Sum of N natural numbers

```
// Write a recursive function to calculate the sum of first N natural numbers

class SumOfNaturalNumbers {
    // Solution 1
    public static int sum(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        return sum(num - 1, sum + num);
    }

    // Solution 2
    public static int naturalSum(int num) {
        if (num == 0) {
            return num;
        }
        int prevNum = naturalSum(num - 1);
        int sum = num + prevNum;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 0));
        System.out.println(naturalSum(5));
    }
}

```

### 3. Factorial of Number

```
// Write a recursive function to find the factorial of a number

public class Factorial {
    // Solution 1
    public static int factorialHandler(int num, int fact) {
        if (num == 0) {
            return fact;
        }
        return factorialHandler(num - 1, fact * num);
    }

    public static int factorial(int num) {
        return factorialHandler(num, 1);
    }

    // Solution 2
    public static int factorialCal(int num) {
        if (num == 1 || num == 0) {
            return num;
        }
        int prevNum = factorial(num - 1);
        int fact = num * prevNum;
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialCal(5));
    }
}

```

### 4. Fibonacci Numbers

```
// Write a recursive function to find the fibonacci series upto N terms
/* Fibonacci upto 8th term
0 1 1 2 3 5 8 13
*/
public class Fibonacci {
    public static void printfibonacci(int term, int firstTerm, int secondTerm){
        if (term == 0){
            return;
        }
        System.out.println(firstTerm);
        printfibonacci(term-1, secondTerm, firstTerm+secondTerm);
    }
    public static void main(String[] args) {
        printfibonacci(8, 0, 1);
    }
}
/*
Term 1 => ft=13, st=21
Term 2 => ft=8, st=13
Term 3 => ft=5, st=8
Term 4 => ft=3, st=5
Term 5 => ft=2, st=3
Term 6 => ft=1, st=2
Term 7 => ft=1, st=1
Term 8 => ft=0, st=1
*/
```

### 5. Power of Number (with stack height = n and log(n))

```
// Write a recursive function to find the power of num

public class PowerOfNum {
    // Method 1 => Stack Height is n
    public static int power(int num, int p, int pow) {
        if (p == 0) {
            return pow;
        }
        return power(num, p - 1, pow * num);
    }

    // Method 2 => Stack Height is n
    public static int powerNum(int num, int p) {
        if (p == 1) {
            return num;
        }
        int pow = num * powerNum(num, p - 1);
        return pow;
    }

    // Method 3 => Stack Height is log(n)
    /*
     * If p is even => power = x^(p/2)*x^(p/2)
     * If p is odd => power = x^(p/2)*x^(p/2)*x
     */
    public static int powerOfNum(int num, int p) {
        if (p == 0) {
            return 1;
        }
        if (p % 2 == 0) {
            return powerOfNum(num, p / 2) * powerOfNum(num, p / 2);
        } else {
            return powerOfNum(num, p / 2) * powerOfNum(num, p / 2) * num;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(5, 3, 1));
        System.out.println(powerNum(5, 3));
        System.out.println(powerOfNum(5, 3));
    }
}

```

---

## Level 2 - Intermediate [8 Questions]

### 1. Tower of Hanoi

```
// Tower of Hanoi
/* Rules
1. Only one disk can be transferred in one step.
2. Smaller disks are always kept on the top of large disks.

Algorithm
1. Move n-1 disk from source to helper using destination.
2. Move the remaining 1 disk from source to destination.
3. Move the n-1 disk from helper to destination using source.
*/

class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + "dest ");
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + "dest ");
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        towerOfHanoi(3, "A", "B", "C");

    }
}

```

### 2. Reverse the String

```
// Reverse a String

public class ReverseString {
    // Approach 1
    public static void reverse(String str) {
        if (str.length() == 0) {
            return;
        }
        reverse(str.substring(1, str.length()));
        System.out.print(str.charAt(0));
    }

    /*
     * D --> D
     * CD --> C
     * BCD --> B
     * ABCD --> A
     */
    // Approach 2
    public static String reverseString(String str) {
        if (str.length() == 0) {
            return str;
        }
        char current = str.charAt(0);
        String nextString = reverseString(str.substring(1, str.length()));
        return nextString + current;
    }

    /*
     * D --> current = D, nextString = "", return --> D
     * CD --> current = C, nextString = D, return --> DC
     * BCD --> current = B, nextString = DC, return --> DCB
     * ABCD --> current = A, nextString = DCB, return --> DCBA
     */
    public static void main(String[] args) {
        reverse("ABCD");
        String reversed = reverseString("MNOP");
        System.out.println(reversed);
    }
}
```

### 3. First and Last occurrence of an element using recursion.

```
public class FirstLastOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, int index, char element) {
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(index);
        if (currentChar == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findOccurence(str, index + 1, element);
    }

    public static void main(String[] args) {
        findOccurence("abbabacbacac", 0, 'a');
    }
}
```

### 4. Check if an array is sorted (strictly increasing) O(n)

```
// Check if the array is sorted or not

class CheckForSortedArray {
    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5, };
        int arr1[] = {3,2,1,0};
        System.out.println(isSorted(arr, 0));
        System.out.println(isSorted(arr1, 0));
    }
}

```

### 5. Move all ‘x’ to the end of the string. - O(n)

```
// Move all x to the end of the string

public class MoveXToTheEnd {
    public static String moveX(String str){
        if(str.length() == 0){
            return "";
        }
        char currentChar = str.charAt(0);
        String nextString = moveX(str.substring(1));
        if(currentChar == 'x'){
            return nextString + currentChar;
        }
        return currentChar + nextString;
    }
    public static void main(String[] args) {
        System.out.println(moveX("abxxcdxxef"));
    }
}

```

### 6. Remove Duplicates in a String

```
// Remove the duplicates from the string
// "abbcdda" => "abcd"

public class RemoveDuplicatesFromString {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        if (map[currentChar - 'a']) {
            removeDuplicates(str, index + 1, newString);
        } else {
            newString += currentChar;
            map[currentChar - 'a'] = true;
            removeDuplicates(str, index + 1, newString);
        }
    }

    public static void main(String[] args) {
        removeDuplicates("abbcdda", 0, "");
    }
}

```

```
public static String removeSuccessiveDuplicates(String str){
        if(str.length() == 1){
            return str;
        }
        char currentChar = str.charAt(0);
        String nextString = removeSuccessiveDuplicates(str.substring(1));
        if(currentChar == nextString.charAt(0)){
            return nextString;
        }
        else{
            return Character.toString(currentChar).concat(nextString);
        }
    }
```

### 7. Subsequences of String

```
// Print all the subsequences of string
// Example: 'abc' => abc, ab, ac, a, bc, b, c, ' ' ==> 2^n subsequences
// Time Complexity: O(2^n)

public class SubsequencesOfString {
    public static void subsequences(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        // include
        subsequences(str, index + 1, newString + currentChar);
        // exclude
        subsequences(str, index + 1, newString);
    }

    public static void main(String[] args) {
        subsequences("abc", 0, "");
    }
}

```

### 8. Unique Subsequences of String

```
import java.util.HashSet;

// Print all the unique subsequences of a string
// Example: "aaa" => aaa, aa, a, ' '
import java.util.*;

public class UniqueSubsequencesOfString {
    public static void uniqueSubsequence(String str, int index, String newString, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentChar = str.charAt(index);
        // include
        uniqueSubsequence(str, index + 1, newString + currentChar, set);
        // exclude
        uniqueSubsequence(str, index + 1, newString, set);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        uniqueSubsequence("aaa", 0, "", set);
    }
}

```

---

## Level 3 - Advanced [ Questions]

### 1. Permutation of String

```
// Find all possible permutation of string using recursion
// Total number of permutation = n!
// Example: abc => 3! => 6 => abc, acb, bac, bca, cba, cab
// Time Complexity: O(n!)

public class PermutationOfString {
    public static void stringPermutation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            stringPermutation(newString, permutation + currentChar);
        }
    }

    public static void main(String[] args) {
        stringPermutation("abc", "");
    }
}

```

### 2. Count Total Path in a Maze to move from (0,0) to (n,m)

```
// Count Total Path in a Maze to move from (0,0) to (n,m)
// Rule: Can move only in right or downward direction
// Explanation: Can move right(i+1, j) or downwards(i, j+1) till (i=n-1, j=n-1)

class CountPathMaze {
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        return countPaths(i + 1, j, n, m) + countPaths(i, j + 1, n, m);
    }

    public static void main(String[] args) {
        System.out.println(countPaths(0, 0, 3, 3)); // 6
    }

}

```

### 3. Tiling Problem

```
// Place Tiles of size 1 x m in floor of size n x m
/*
Hints: Different ways may include
1. Place tiles horizontally
2. Place tiles vertically
3. Place tiles horizontally then vertically
4. Place tiles vertically then horizontally
5. Place tiles horizonally then vertically then horizontally
depending upon the value of n, m
*/
class PlaceTiles {
    public static int placeTiles(int n, int m) {
        // base case
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // vertically placements
        int verticalPlacements = placeTiles(n - m, m);

        // horizontally
        int horizontalPlacements = placeTiles(n - 1, m);

        return verticalPlacements + horizontalPlacements;

    }

    public static void main(String[] args) {
        System.out.println(placeTiles(4, 2));
    }
}

```

### 4. Friends Pairing

```
// Find the number of ways in which you can invite n people to your party, single or pairs
/*
Explanation
n=1 => 1
n=2 => [(1), (2)], [(1,2)] => 2
n=3 => [(1), (2), (3)], [(1,2), (1,3)], [(2,3)], [(1), [2,3]] => 4

i.e. single, pair, mix
*/

public class FriendsPairing {
    public static int pairFriends(int n) {
        if (n <= 1) {
            return 1;
        }
        // single
        int single = pairFriends(n - 1);

        // pair
        int pair = (n - 1) * pairFriends(n - 2);

        return single + pair;
    }

    public static void main(String[] args) {
        System.out.println(pairFriends(4));
    }
}

```

### 5. Subset of Set

```

// Print all the subsets of a set of first n natural numbers
import java.util.ArrayList;

public class SubsetOfSet {
    public static void printSubsets(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubsets(subset);
            return;
        }

        findSubsets(n - 1, subset);
        subset.add(n);
        findSubsets(n - 1, subset);
        subset.remove(subset.size() - 1);
    }

    public static void main(String[] args) {
        int n = 3;
        findSubsets(n, new ArrayList<Integer>());

    }
}

```
