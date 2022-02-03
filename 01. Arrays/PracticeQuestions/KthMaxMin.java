// Find the kth max and kth min in an array

class KthMaxMin {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Approach 1: Sort the array and return the element based on index number
    public static int kthMax(int[] arr, int k) {
        bubbleSort(arr);
        return arr[arr.length - k];
    }

    public static int kthMin(int[] arr, int k) {
        bubbleSort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 1, 9, 0, 3, 7 };
        System.out.println(kthMax(arr, 5));
        System.out.println(kthMin(arr, 5));
    }
}