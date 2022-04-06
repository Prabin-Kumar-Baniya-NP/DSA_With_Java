class Merge_Sort{
	public void conquer(int[] arr, int startIndex, int midIndex, int endIndex) {
        // Create a new array to storing the storted elements
        int mergedArray[] = new int[endIndex - startIndex + 1];
        // Create an iterator i1 for first array
        int i1 = startIndex;
        // Create an iterator i2 for second array
        int i2 = midIndex + 1;
        // Create an iterator m for mergedArray iteration
        int m = 0;

        // Run while loop till i1 and i2 reaches their end
        while (i1 <= midIndex && i2 <= endIndex) {
            // Compare the elements from both array and put the smallest element in merged array
            if (arr[i1] <= arr[i2]) {
                mergedArray[m++] = arr[i1++];
            } else {
                mergedArray[m++] = arr[i2++];
            }
        }
        // If there are any remaining elements in first array, put them in merged array 
        while (i1 <= midIndex) {
            mergedArray[m++] = arr[i1++];
        }
        // If there are any remaining elements in second array, put them in merged array 
        while (i2 <= endIndex) {
            mergedArray[m++] = arr[i2++];
        }
        // Put the elements of merged array into original array
        // j starts from startIndex beacase start Index of original array is varrying
        for (int i = 0, j = startIndex; i < mergedArray.length; i++, j++) {
            arr[j] = mergedArray[i];
        }
    }

    public void divide(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        // Find the midIndex to divide the array into two parts
        int midIndex = (startIndex + endIndex) / 2;
        // First Part of array will be from startIndex to midIndex
        divide(arr, startIndex, midIndex);
        // Second Part of array will be from midIndex + 1 to endIndex
        divide(arr, midIndex + 1, endIndex);
        // After dividing tha array, conquer the array i.e. start merging
        conquer(arr, startIndex, midIndex, endIndex);
    }
	static void printArray(int array[])
	{
		for(int element: array){
			System.out.println(element + " ");
		}
	}
	public static void main(String[] args) {
		int array[] = {12,11,13,5,6,7};
		System.out.println("Given Array");
		printArray(array);
		Merge_Sort obj = new Merge_Sort();
		obj.divide(array, 0, array.length-1);
		System.out.println("\nSorted Array");
		printArray(array);
	}
}