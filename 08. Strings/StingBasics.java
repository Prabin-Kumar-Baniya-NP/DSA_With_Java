import java.util.Scanner;

public class StingBasics {
    public static void main(String[] args) {
        // String Declaration
        String name = "Prabin";
        String fullName = "Prabin Kumar Baniya";

        String name1;
        String fullName1;
        Scanner sc = new Scanner(System.in);
        name1 = sc.next();
        System.out.println(name1);
        sc.nextLine(); // Consuming <enter> from input
        fullName1 = sc.nextLine();
        System.out.println(fullName1);
        
        // String Concatenation
        String firstName = "Prabin";
        String lastName = "Baniya";
        System.out.println(firstName + " " + lastName);

        // Length of String
        System.out.println(firstName.length());

        // Accessing character of String
        for(int i=0; i<firstName.length(); i++){
            System.out.print(firstName.charAt(i));
        }

        // Comparing String in Java
        // firstName > lastName = + value
        // firstName < lastName = - value
        // firstName = lastName = 0
        System.out.print(firstName.compareTo(lastName));
        System.out.println(firstName.equals(lastName));

        // Substring in Java
        System.out.println(firstName.substring(0, 3));

        // String to Integer
        System.out.println(Integer.parseInt("123"));
        // Integer to String
        System.out.println(Integer.toString(1234));
    }
}
