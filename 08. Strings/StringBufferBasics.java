public class StringBufferBasics {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Tony");
        // Get character at particular index
        System.out.println(sb.charAt(0));
        // Set character at particular index
        sb.setCharAt(0, 'S');
        System.out.println(sb);
        // Insert a character at particular index
        sb.insert(3, 'p');
        System.out.println(sb);
        // delete a character from a certain range
        sb.delete(3, 4);
        System.out.println(sb);
        // Append a character
        sb.append('t');
        System.out.println(sb);
    }
}
