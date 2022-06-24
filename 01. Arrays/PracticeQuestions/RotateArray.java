/* 
 Write a program to rotate the array by d elements
 Input:
 1 2 3 4 5 6 7
 2
 Output:
 3 4 5 6 7 1 2 
*/

public class RotateArray {
    static void reverseArray(int arr[], int start, int end) {
        int temp;
        while (start <= end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d, int n)
    {
        if(d==0){
            return;
        }
        // For d>n i.e. rotating factor is greater than the array length
        d = d % n;
        // Reverse the first d elements
        reverseArray(arr, 0, d-1);
        // Reverse the elements from d to n-1
        reverseArray(arr, d, n-1);
        // Reverse the entire array
        reverseArray(arr, 0, n-1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int d = 3;
        rotateArr(arr, d, arr.length);
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}
