// Time Complexity: O(n^2)
// In bubble sort, we repeatedly swap two adjacent elements if they are in wrong order

class Bubble_Sort {
	void sort(int[] array) // Time compplexity will remain O(n^2) in both best case and worst case
	{
		for (int i = 0; i < array.length - 1; i++)
			for (int j = 0; j < array.length - i - 1; j++)
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
	}

	void optimized_sort(int[] array) // For Best case(array is sorted), time complexity will be O(n) and for worst
										// case O(n^2)
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

	void print_array(int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}
	}

	public static void main(String[] args) {
		Bubble_Sort obj = new Bubble_Sort();
		int array[] = { 5, 9, 2, 4, 0, 3, 1 };
		int sorted_array[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Before Bubble Sort");
		obj.print_array(array);
		System.out.println("\nAfter Bubble Sort");
		obj.sort(array);
		obj.print_array(array);
		System.out.println("\nBefore Bubble Sort");
		obj.print_array(sorted_array);
		System.out.println("\nAfter Bubble Sort");
		obj.sort(sorted_array);
		obj.print_array(sorted_array);
	}
}