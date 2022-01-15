# Introduction to Array in Java

Note:
- An array is a collection of similar types of data.
- In Java, all arrays are dynamically allocated.
- Since arrays are objects in Java, we can find their length using the object property length. 

---
### Creating Array in Java
```
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
```
## Accessing Array Elements using for loop
```
for(int i = 0; i < array1.length; i++)
{
	System.out.println(array1[i]);
}
```
## Accessing array elements using for each
```
for(int num: array1){
	System.out.println(num);
}
```