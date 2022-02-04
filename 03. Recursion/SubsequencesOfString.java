// Print all the subsequences of string
// Example: 'abc' => abc, ab, ac, a, bc, b, c, ' ' ==> 2^n subsequences
// Time Complexity: O(2^n)

public class SubsequencesOfString {
    public static void subsequences(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        subsequences(str, index + 1, newString + currentChar);
        subsequences(str, index + 1, newString);
    }

    public static void main(String[] args) {
        subsequences("abc", 0, "");
    }
}
