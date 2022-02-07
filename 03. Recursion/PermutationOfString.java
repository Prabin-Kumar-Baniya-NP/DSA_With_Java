// Find all possible permutation of string using recursion
// Total number of permutation = n!
// Example: abc => 3! => 6 => abc, acb, bac, bca, cba, cab
// Time Complexity: O(n!)

public class PermutationOfString {
    public static void stringPermutation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            stringPermutation(newString, permutation + currentChar);
        }
    }

    public static void main(String[] args) {
        stringPermutation("abc", "");
    }
}
