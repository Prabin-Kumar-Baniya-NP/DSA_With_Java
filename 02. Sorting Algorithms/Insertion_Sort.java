// Insertion Sort Time Complexity: O(n^2)
// Insert an element from an unsorted array to its correct position in sorted array

class Insertion_Sort {
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

	public void print_array(int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}
	}

	public static void main(String[] args) {
		int[] array = { 6, 2, 9, 1, 7, 5, 4, 3, 0 };
		Insertion_Sort obj = new Insertion_Sort();
		System.out.println("Before Sorting");
		obj.print_array(array);
		System.out.println("\nAfter Sorting");
		obj.sort(array);
		obj.print_array(array);
	}
}