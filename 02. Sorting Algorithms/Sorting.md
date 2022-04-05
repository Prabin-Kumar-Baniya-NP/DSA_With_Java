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
