# Sorting Algorithms

## 1. Bubble Sort

- Time compplexity will remain O(n^2) in both best case and worst case

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

```
public void sort(int array[]) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > current) {
				// Keep swapping
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = current;
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
