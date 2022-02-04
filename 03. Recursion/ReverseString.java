// Reverse a String

public class ReverseString {
    // Approach 1
    public static void reverse(String str) {
        if (str.length() == 0) {
            return;
        }
        reverse(str.substring(1, str.length()));
        System.out.print(str.charAt(0));
    }

    /*
     * D --> D
     * CD --> C
     * BCD --> B
     * ABCD --> A
     */
    // Approach 2
    public static String reverseString(String str) {
        if (str.length() == 0) {
            return str;
        }
        char current = str.charAt(0);
        String nextString = reverseString(str.substring(1, str.length()));
        return nextString + current;
    }

    /*
     * D --> current = D, nextString = "", return --> D
     * CD --> current = C, nextString = D, return --> DC
     * BCD --> current = B, nextString = DC, return --> DCB
     * ABCD --> current = A, nextString = DCB, return --> DCBA
     */
    public static void main(String[] args) {
        reverse("ABCD");
        String reversed = reverseString("MNOP");
        System.out.println(reversed);
    }
}