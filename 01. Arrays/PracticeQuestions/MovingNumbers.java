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
        int pivot = 0;
        int i = 0;
        for(int j=0; j<arr.length; j++){
            if(arr[j] > pivot){
                swap(arr, i, j);
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,-1,3,2,-7,-5,11,6};
        moveNumbers(arr);
        for (int e : arr) {
            System.out.println(e);
        }
    }
}
