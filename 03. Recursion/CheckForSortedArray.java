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
