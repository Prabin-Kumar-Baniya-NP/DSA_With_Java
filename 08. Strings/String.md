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
|   |  String | String Builder | String Buffer  |
|---|---|---|---|
| Modificable  |  No | Yes  | Yes  |
| Thread-safe  |  Yes | No  | Yes  |
|  Performance | Fast  | Fast  | Slow  |