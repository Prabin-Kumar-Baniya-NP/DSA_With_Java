/*
Given an array, rotate the array by one position in clock-wise direction.
 
Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
 

Example 2:

Input:
N = 8
A[] = {9, 8, 7, 6, 4, 2, 1, 3}
Output:
3 9 8 7 6 4 2 1
 
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1<=N<=105
0<=a[i]<=105
*/

/*
Algorithm
We can use two pointers, say i and j which point to first and last element of array respectively. 
As we know in cyclic rotation we will bring last element to first and shift rest in forward direction, 
so start swaping arr[i] and arr[j] and keep j fixed and i moving towards j.  
Repeat till i is not equal to j.
*/
import java.util.Arrays;

public class ArrayRotation {
    public static void rotate(int[] arr) {
        int left = 0, right = arr.length - 1;
        while(left != right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
