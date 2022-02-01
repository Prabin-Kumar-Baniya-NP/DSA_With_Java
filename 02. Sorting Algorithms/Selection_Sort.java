// Time Complexity : O(n^2)
// Auxiliary Space : O(1) 
// Select the minimum element in the unsorted array and swap it with the element at the begining.

class Selection_Sort {
	void sort(int[] array) {
		// One by one we have to move the boundary to unsorted array
		for (int i = 0; i < (array.length - 1); i++) {
			// Assume the first index of the current boundary is having minimum value
			int minimum_index = i;
			// Check for every element after minimum index whether it holds minimum value or
			// not
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

	// Method to print array
	void print_array(int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}
	}

	public static void main(String args[]) {
		Selection_Sort obj = new Selection_Sort();
		int array[] = { 9, 1, 3, 8, 4, 0, 2, 7 };
		System.out.println("Before Sorting");
		obj.print_array(array);
		obj.sort(array);
		System.out.println("\nAfter Sorting");
		obj.print_array(array);
	}
}