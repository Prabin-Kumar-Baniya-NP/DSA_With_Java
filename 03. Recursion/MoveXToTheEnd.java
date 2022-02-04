// Move all x to the end of the string

public class MoveXToTheEnd {
    public static String moveX(String str){
        if(str.length() == 0){
            return "";
        }
        char currentChar = str.charAt(0);
        String nextString = moveX(str.substring(1));
        if(currentChar == 'x'){
            return nextString + currentChar;
        }
        return currentChar + nextString;
    }
    public static void main(String[] args) {
        System.out.println(moveX("abxxcdxxef"));
    }
}
