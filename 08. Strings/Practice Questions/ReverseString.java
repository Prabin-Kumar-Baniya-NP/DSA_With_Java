class ReverseString {
    // Reverse the string
    // programming => gnimmargorp
    static void reverse(char str[], int n) {
        int left = 0;
        int right = str.length - 1;
        char temp;
        while (left <= right) {
            temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char str[] = "programming".toCharArray();
        reverse(str, str.length);
        for(char e: str){
            System.out.print(e);
        }
    }
}
