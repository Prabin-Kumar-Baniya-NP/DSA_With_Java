class Merge_Sort{
	// merges two subarrays of array[]
	void merge(int array[], int left, int midpoint, int right){
		// Find the size of two subarrays to be merged
		int left_size = midpoint - left + 1;
		int right_size = right - midpoint;

		// Create Two Temporary Arrays
		int left_array[] = new int[left_size];
		int right_array[] = new int[right_size];

		// Copying the data from array to the tempoaray arrays
		for(int i = 0; i < left_size; i++){
			left_array[i] = array[left + i];
		}
		for(int j =0; j < right_size; j++)
		{
			right_array[j] = array[midpoint+1+j];
		}

		// Merging the temporary array

		// Setting the initial index of left and right sub arrays
		int i = 0, j =0;

		// Initial Index of merged subarray 
		int k = left;

		while(i < left_size && j < right_size){
			if(left_array[i] <= right_array[j]){
				array[k] = left_array[i];
				i++;
			}
			else{
				array[k] = right_array[j];
				j++;
			}
			k++;
		}
		// Copy remaining elements of left_array[] if any
		while(i < left_size){
			array[k] = left_array[i];
			i++;
			k++;
		}

		// Copy remaining elements of right_array[] if any
		while(j< right_size)
		{
			array[k] = right_array[j];
			j++;
			k++;
		}
	}
	void sort(int array[], int left, int right){
		if (left < right){
			// Find the middle point
			int midpoint = (left + right) /2;

			// Sort first and second halves
			sort(array, left, midpoint);
			sort(array, midpoint+1, right);

			// Merge the sorted Halves
			merge(array, left, midpoint, right);
		}
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
		obj.sort(array, 0, array.length-1);
		System.out.println("\nSorted Array");
		printArray(array);
	}
}