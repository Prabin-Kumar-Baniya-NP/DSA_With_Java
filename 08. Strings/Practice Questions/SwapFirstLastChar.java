import java.lang.StringBuffer;

class SwapFirstLastChar {
    static String swap(String str) {
        StringBuffer swapped = new StringBuffer(str);
        swapped.setCharAt(0, str.charAt(str.length() - 1));
        swapped.setCharAt(str.length() - 1, str.charAt(0));
        return swapped.toString();
    }

    public static void main(String[] args) {
        String str = "programming";
        System.out.println(swap(str));
    }
}