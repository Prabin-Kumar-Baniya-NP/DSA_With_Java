class CheckForNumber {
    // Checks whether the given string is a number or not
    // "123" => true , "ab12" => false
    static boolean isNum(String str){
        try{
            Integer.parseInt(str);
        }
        catch (NumberFormatException e){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "ab12";
        System.out.println(isNum(str1));
        System.out.println(isNum(str2));
    }    
}
