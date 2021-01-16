class Practice1{
	void sort(int[] array)
	{
		for(int i = 0; i < (array.length-1); i++)
		{
			int minimum_index = i;
			for(int j = i; j < array.length; j++)
			{
				if(array[j] < array[minimum_index])
				{
					minimum_index = j;
				}
			}
			int temp = array[minimum_index];
			array[minimum_index] = array[i];
			array[i] = temp;
		}
	}

	void print_array(int[] array)
	{
		for(int value: array)
		{
			System.out.print(value + " ");
		}
	}
	public static void main(String args[])
	{
		Practice1 obj = new Practice1();
		int array[] = {1,9,3,0,4};
		System.out.println("Before Sorting");
		obj.print_array(array);
		obj.sort(array);
		System.out.println("\nAfter Sorting");
		obj.print_array(array);
	}
}