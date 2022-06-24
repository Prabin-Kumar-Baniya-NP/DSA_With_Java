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

### Accessing Array Elements using for loop

```
for(int i = 0; i < array1.length; i++)
{
	System.out.println(array1[i]);
}
```

### Accessing array elements using for each

```
for(int num: array1){
	System.out.println(num);
}
```

---

## Array Rotation

### 1. Function to reverse the array

```
static void reverseArray(int arr[], int start, int end) {
    int temp;
    while (start <= end) {
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
```

---

### 2. Function to rotate the array by d elements in anti-clockwise direction

```
Input:
1 2 3 4 5
2
Output:
3 4 5 1 2

Time Complexity : O(n)
Auxiliary Space: O(1)
```

```
static void rotateArr(int arr[], int d, int n)
    {
    	if(d==0){
            return;
        }
        // For d>n i.e. rotating factor is greater than the array length
        d = d % n;
        // Reverse the first d elements
        reverseArray(arr, 0, d-1);
        // Reverse the elements from d to n-1
        reverseArray(arr, d, n-1);
        // Reverse the entire array
        reverseArray(arr, 0, n-1);
    }
```

---

### 3. Function to rotate the array by d elements in anti-clockwise / counter-clockwise direction

```
Input:
1 2 3 4 5 6
2

Output:
5 6 1 2 4 4

Time Complexity : O(n)
Auxiliary Space: O(1)
```

```
static void rotate(int arr[], int r, int n) {
    // reverse the entire array
    reverse(arr, 0, n - 1);
    // Reverse the elements from 0 to r-1
    reverse(arr, 0, r-1);
    // Reverse the elements from r to n-1
    reverse(arr, r, n - 1);
    }
```

---

### 4. Function to rotate the elements by one in clock-wise direction

```
Input:
N = 5
A[] = {1, 2, 3, 4, 5}

Output:
5 1 2 3 4

Time Complexity: O(N)
Auxiliary Space: O(1)
```

```
static void rotate(int arr[], int n)
    {
        int r=1;
        // reverse the first n elements
        reverse(arr, 0, n-r-1);
        // reverse the entire array
        reverse(arr, 0, n-1);
    }
```

---

### 5. Search an element in rotated sorted array

```
Input:
N = 9
arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}
key = 10

Output:
5

Explanation: 10 is found at index 5.

Time Complexity: O(log n). 
Binary Search requires log n comparisons to find the element. So time complexity is O(log n).

Space Complexity: O(1). 
As no extra space is required.
```

Algorithm:

- Find the middle element and check whether it is equal to key element or not
- If middle element is not equal to key element, find the sorted sub-array
- If arr[start] < arr[mid], then left side is sorted else right side is sorted.
- Check whether the key belongs to that sorted sub-array or not.
- If key belongs to sorted sub-array, apply binary search on that sorted part else apply on non-sorted part.

```
static int modifiedbinarySearch(int arr[], int key, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (arr[mid] == key) {
            return mid;
        }
        // Find the sorted subarray
        if (arr[start] < arr[mid]) { // Left sub-array is sorted
            // Check whether the key falls on this sorted array
            if (key >= arr[start] && key <= arr[mid]) {
                // Key belongs to this left sorted sub-array
                return modifiedbinarySearch(arr, key, start, mid - 1);
            }
            // Key doesn't falls on this left sorted sub-array
            return modifiedbinarySearch(arr, key, mid + 1, end);
        }
        // If Left sub-array is not sorted, Right Side is sorted
        // Check whether the key falls on this right sorted array
        if (key >= arr[mid + 1] && key <= arr[end]) {
            // key belongs to this right sorted sub-array
            return modifiedbinarySearch(arr, key, mid + 1, end);
        }
        // Key doesn't falls on this right sorted sub-array
        return modifiedbinarySearch(arr, key, start, mid - 1);
    }
```
