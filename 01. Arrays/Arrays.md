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

<b>Important Questions</b>

1. Rotate the array by rotating factor "x" in clockwise direction. {1 2 3 4 5} => {3 4 5 1 2}
2. Rotate the array by rotating factor "x" in anti-clockwise / counter-clockwise direction. {1 2 3 4 5 6} => {5 6 1 2 3 4}
3. Search an element in rotated sorted array.
4. Check for pair with a given sum in rotated sorted array.
5. Find the rotating factor in a given rotated sorted array.
6. Find minimum element in rotated sorted array.

### Useful Function to reverse the array

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

### 1. Function to rotate the array by d elements in anti-clockwise direction

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

### 2. Function to rotate the array by d elements in anti-clockwise / counter-clockwise direction

```
Input:
1 2 3 4 5 6
2

Output:
5 6 1 2 3 4

Time Complexity : O(n)
Auxiliary Space: O(1)
```

```
static void rotate(int arr[], int r, int n) {
    if(r==0){
            return;
        }
    // For r>n i.e. rotating factor is greater than the array length
    r = r % n;
    // reverse the entire array
    reverse(arr, 0, n - 1);
    // Reverse the elements from 0 to r-1
    reverse(arr, 0, r-1);
    // Reverse the elements from r to n-1
    reverse(arr, r, n - 1);
    }
```

---

### 3. Function to rotate the elements by one in clock-wise direction

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

### 4. Search an element in rotated sorted array

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

### 5. Check for pair with a given sum in rotated sorted array

```
Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
Output: true

There is a pair (6, 10) with sum 16

Time Complexity: O(n)

Auxiliary Space: O(1)
```

```
static boolean checkPair(int arr[], int n, int sum) {
        int smallest, greatest;
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                break;
            }
        }
        greatest = i;
        smallest = (greatest + 1) % n;
        while (smallest != greatest) {
            if (arr[smallest] + arr[greatest] == sum)
                return true;
            if (arr[smallest] + arr[greatest] < sum) {
                smallest = (smallest + 1) % n; // Find another successive smallest
            } else {
                greatest = (greatest + n - 1) % n; // Find another successive greatest
            }
        }
        return false;
    }
```

### 6. Find the rotating factor in a given rotated sorted array

```
Input:
N = 5
Arr[] = {1, 2, 3, 4, 5}

Output: 0
Explanation: The given array is not rotated.

Expected Time Complexity: O(log(N))

Expected Auxiliary Space: O(1)
```

```
static int findKRotation(int arr[], int n) {
        for(int i=0; i<n-1; i++){
	        if(arr[i] > arr[i+1]){
	            return i+1;
	        }
	    }
	    return 0;
    }
```

### 7. Find minimum element in rotated sorted array

```
Input:
N = 5
arr[] = {4 ,5 ,1 ,2 ,3}
Output: 1
Explanation: 1 is the minimum element inthe array.

```

```
static int findMin(int arr[], int n)
    {

        // For all cases => {4,5,1,2,3} i.e rf >=2
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1])
                return arr[i+1];
        }
        // Edge case => {5,1,2,3,4} i.e rf=1
        if(arr[0] < arr[1])
            return arr[0];
        return -1;
    }
```
