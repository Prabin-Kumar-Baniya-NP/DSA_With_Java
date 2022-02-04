
public class FirstLastOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, int index, char element) {
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(index);
        if (currentChar == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findOccurence(str, index + 1, element);
    }

    public static void main(String[] args) {
        findOccurence("abbabacbacac", 0, 'a');
    }
}
