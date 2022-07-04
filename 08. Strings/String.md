# String in Java

Note: Java String are immutable

### Declaring String

```
String name = "Prabin";
String fullName = "Prabin Kumar Baniya";
```

### Taking Multi-line String Input from User

```
Scanner sc = new Scanner(System.in);
name = sc.next();
sc.nextLine(); // Consuming <enter> from input
fullName1 = sc.nextLine();
```

### String Concatenation

```
String firstName = "Prabin";
String lastName = "Baniya";
System.out.println(firstName + " " + lastName);
```

### Length of String

```
System.out.println(firstName.length());
```

### Accessing character of String

Note

```
for(int i=0; i<firstName.length(); i++){
System.out.print(firstName.charAt(i));
}
```

### Comparing String in Java

Note: Don't use == to compare two String because Strings are object in Java, so comparing result might be different than expected.

```
// firstName > lastName => + value
// firstName < lastName => - value
// firstName = lastName => 0 value
System.out.print(firstName.compareTo(lastName));
System.out.println(firstName.equals(lastName));
```

### Substring in Java

```
System.out.println(firstName.substring(0, 3));
```

### String to Integer

```
System.out.println(Integer.parseInt("123"));
```

### Integer to String

```
System.out.println(Integer.toString(1234));
```

---

# String Builder

### Creating String Builder

```
StringBuilder sb = new StringBuilder("Tony");
```

### Get character at particular index

```
System.out.println(sb.charAt(0));
```

### Set character at particular index

```
sb.setCharAt(0, 'S');
```

### Insert a character at particular index

```
sb.insert(3, 'p');
```

### delete a character from a certain range

```
sb.delete(3, 4);
```

### Append a character

```
sb.append('t');
```

# String Buffer

### Creating String Buffer

```
StringBuffer sb = new StringBuffer("Tony");
```

### Get character at particular index

```
System.out.println(sb.charAt(0));
```

### Set character at particular index

```
sb.setCharAt(0, 'S');
```

### Insert a character at particular index

```
sb.insert(3, 'p');
```

### delete a character from a certain range

```
sb.delete(3, 4);
```

### Append a character

```
sb.append('t');
```

## Difference Between String, String Builder and String Buffer

|             | String | String Builder | String Buffer |
| ----------- | ------ | -------------- | ------------- |
| Modificable | No     | Yes            | Yes           |
| Thread-safe | Yes    | No             | Yes           |
| Performance | Fast   | Fast           | Slow          |

## Practice Questions

### 1. Swap first and last character of the string

```
static String swap(String str) {
            StringBuffer swapped = new StringBuffer(str);
            swapped.setCharAt(0, str.charAt(str.length() - 1));
            swapped.setCharAt(str.length() - 1, str.charAt(0));
            return swapped.toString();
        }
```

### 2. Check whether the string is number

```
static boolean isNum(String str){
        try{
            Integer.parseInt(str);
        }
        catch (NumberFormatException e){
            return false;
        }
        return true;
    }
```

### 3. Reverse the string

```
// programming => gnimmargorp
    static void reverse(char str[], int n) {
        int left = 0;
        int right = str.length - 1;
        char temp;
        while (left <= right) {
            temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }
```

### 4. Function to copy string from one to another

1. Iterative Approach
   ```
   static void iterativeCopy(char str1[], char str2[]) {
           for (int i = 0; i < str1.length; i++) {
               str2[i] = str1[i];
           }
       }
   ```
2. Recursive Approach
   ```
   static void recursiveCopy(char str1[], char str2[], int i) {
           if (i == str1.length) {
               return;
           }
           str2[i] = str1[i];
           i++;
           recursiveCopy(str1, str2, i);
       }
   ```

- Main Method
  ```
  public static void main(String[] args) {
          char str1[] = "apple".toCharArray();
          char str2[] = new char[str1.length];
          char str3[] = "banana".toCharArray();
          char str4[] = new char[str3.length];
          iterativeCopy(str1, str2);
          recursiveCopy(str3, str4, 0);
          for (char e : str2) {
              System.out.print(e);
          }
          System.out.println("");
          for (char e : str4) {
              System.out.print(e);
          }
      }
  ```

### 5. Check whether the string is Panagram or not

```
static boolean checkPanagram(String str){
        // Create a frequency Array of size 26
        boolean freq[] = new boolean[26];

        // Iterate over the string
        for(int i=0; i<str.length(); i++){
            
            // Lowercase the string and then get the ith character
            char currentChar = str.toLowerCase().charAt(i);
            
            // Check whether the character belongs to {a to z} to ignore space, special symbols.
            if (currentChar >= 'a' && currentChar <= 'z'){
                
                // Set the value of char to true in freq array
                freq[currentChar - 'a'] = true;
            }
        }
        // Iterate over the frequency array
        for(int i=0; i<freq.length; i++){
            
            // If any value is false return false
            if(freq[i] == false)
                return false;
        }
        return true;
    }
```
