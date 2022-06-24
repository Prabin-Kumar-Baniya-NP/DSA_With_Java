/*
Given an array, rotate the array by one position in clock-wise direction.
Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
 */

public class CyclicallyRotate {
    static void reverse(int arr[], int start, int end){
        int temp;
        while(start<=end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotate(int arr[], int n)
    {   
        int r=1;
        // reverse the first n elements
        reverse(arr, 0, n-r-1);
        // reverse the entire array
        reverse(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        rotate(arr, arr.length);
        for(int e: arr){
            System.out.println(e);
        }
    }
}
