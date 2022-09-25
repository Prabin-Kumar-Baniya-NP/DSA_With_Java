# Sorting Algorithms

### Time Complexity

![Time Complexity](https://www.researchgate.net/profile/Mohammad-Qatawneh/publication/334131761/figure/tbl1/AS:775791717658625@1561974567547/The-Time-Complexity-of-Different-Sorting-algorithms-1.png)

## 1. Bubble Sort

- Bubble out the largest element to the end of the array
- Example for {5,4,3,2,1}
  - Step 1: {5,4,3,2,1} => {4,3,2,1,5}
  - Step 2: {4,3,2,1} => {3,2,1,4,5}
  - Step 3: {3,2,1} => {2,1,3,4,5}
  - Step 4: {2,1} => {1,2,3,4,5}

```
void sort(int[] array)
	{
		for (int i = 0; i < array.length - 1; i++)
			for (int j = 0; j < array.length - i - 1; j++)
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
	}
```

- For Best case(array is sorted), time complexity will be O(n) and for worst case O(n^2)

```
void optimized_sort(int[] array)
	{
		boolean is_swapped;
		for (int i = 0; i < array.length - 1; i++) {
			is_swapped = false;
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					is_swapped = true;
				}
			}
			if (is_swapped == false)
				break;
		}
	}
```

## 2. Selection Sort

- Select the minimum element in the unsorted array and put it at the starting index of unsorted array.
- Example for {5,4,3,2,1}
  - Step 1: {5,4,3,2,1} => {1,5,4,3,2}
  - Step 2: {5,4,3,2} => {1,2,5,4,3}
  - Step 3: {5,4,3} => {1,2,3,5,4}
  - Step 4: {5,4} => {1,2,3,4,5}

```
void selectionSort(int[] array) {
		// One by one we have to move the boundary to unsorted array
		for (int i = 0; i < (array.length - 1); i++) {

			// Assume the first index of the current boundary is having minimum value
			int minimum_index = i;

			// Check for every element after minimum index whether it holds minimum value or not
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minimum_index])
					minimum_index = j;
			}

			// Swap the element in minimum_index with i
			int temp = array[minimum_index];
			array[minimum_index] = array[i];
			array[i] = temp;
		}
	}
```

## 3. Insertion Sort

- Divide the array into sorted and unsorted part and move first element of unsorted array into right position in sorted array.
- Example for {5,4,3,2,1}
  - Step 1: {5}, {4,3,2,1} => {4,5}, {3,2,1}
  - Step 2: {4,5}, {3,2,1} => {3,4,5}, {2,1}
  - Step 3: {3,4,5}, {2,1} => {2,3,4,5}, {1}
  - Step 4: {2,3,4,5}, {1} => {1,2,3,4,5}, {}

```
public void sort(int array[]) {
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1; // Sorted Part => 0 to j
            while(j>=0 && arr[j] > temp){
                // Move one element one step ahead
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
	}
```

## 4. Merge Sort

```
public static void conquer(int[] arr, int startIndex, int midIndex, int endIndex) {
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

    public static void divide(int[] arr, int startIndex, int endIndex) {
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
```

## 5. Quick Sort

- Worst Case of quick sort is O(n^2). This case is when the pivot element is smallest or largest.

```
public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j= low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; // pivot index
    }
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }
```
