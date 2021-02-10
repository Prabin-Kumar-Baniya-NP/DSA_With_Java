class Practice2{
	public void sort(int[] array)
	{
		int size = array.length;
		for(int i =1; i< size;i++)
		{
			int key = array[i];
			int j = i-1;

			while(j >= 0 && key < array[j])
			{
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
	}
	public static void main(String[] args) {
		
	}
}