class Student{
	String name;
	int age;
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	Student(int age, String name){
		this.name = name;
		this.age = age;
	}
	public static void get_student_name_only(Student[] array){
		for(Student s: array){
			System.out.println(s.name);
		}
	}
	public static int[] get_student_age_only(Student[] array){
		int[] age = new int[array.length];
		for(int i=0; i< array.length; i++)
		{
			age[i] = array[i].age;
		}
		return age;
	}
}
class Arrays_Introduction{
	public static void main(String args[])
	{
		int[] array1 = {1,2,3,4,5,6,7};  
		byte array2[]; // Array Declaration
		array2 = new byte[6]; // Allocating memory to the array
		long array3[] = new long[5];
		boolean[][] array4 = new boolean[3][2];
		String[][][] array5 = new String[2][2][2];
		// Creating Student objects
		Student s1 = new Student("Prabin", 19);
		Student s2 = new Student(20, "John");
		Student s3 = new Student("Lily", 19);
		// Creating Arrays of Student
		Student[] array6 = new Student[3];
		array6[0] = s1;
		array6[1] = s2;
		array6[2] = s3;
		// Accessing Array Elements using for loop
		for(int i = 0; i < array1.length; i++)
		{
			System.out.println(array1[i]);
		}
		// Accessing array elements using for each
		for(int num: array1){
			System.out.println(num);
		}
		// Passsing array to a method
		Student.get_student_name_only(array6);
		// Getting array from a method
		int[] array7 = Student.get_student_age_only(array6);
		for(int i = 0; i < array7.length; i++)
		{
			System.out.println(array7[i]);
		}
	}
}