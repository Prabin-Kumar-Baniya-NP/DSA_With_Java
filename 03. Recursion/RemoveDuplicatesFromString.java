// Remove the duplicates from the string
// "abbcdda" => "abcd"

public class RemoveDuplicatesFromString {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currentChar = str.charAt(index);
        if (map[currentChar - 'a']) {
            removeDuplicates(str, index + 1, newString);
        } else {
            newString += currentChar;
            map[currentChar - 'a'] = true;
            removeDuplicates(str, index + 1, newString);
        }
    }

    public static void main(String[] args) {
        removeDuplicates("abbcdda", 0, "");
    }
}
