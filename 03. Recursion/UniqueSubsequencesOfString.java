import java.util.HashSet;

// Print all the unique subsequences of a string
// Example: "aaa" => aaa, aa, a, ' '
import java.util.*;

public class UniqueSubsequencesOfString {
    public static void uniqueSubsequence(String str, int index, String newString, HashSet<String> set) {
        if (index == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentChar = str.charAt(index);
        uniqueSubsequence(str, index + 1, newString + currentChar, set);
        uniqueSubsequence(str, index + 1, newString, set);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        uniqueSubsequence("aaa", 0, "", set);
    }
}
