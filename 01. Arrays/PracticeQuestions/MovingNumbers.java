// Move all negative numbers to beginning and positive to end with constant extra space
// Note: The order of elements in the resulting array is not important.
// Time Complexity: O(N)

public class MovingNumbers {
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void moveNumbers(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= arr.length - 1 && right >= 0) {
            if (arr[left] > 0 && arr[right] < 0) {
                swap(arr, left, right);
            }
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        moveNumbers(arr);
        for (int e : arr) {
            System.out.println(e);
        }
    }
}
