class CopyString {
    static void iterativeCopy(char str1[], char str2[]) {
        for (int i = 0; i < str1.length; i++) {
            str2[i] = str1[i];
        }
    }

    static void recursiveCopy(char str1[], char str2[], int i) {
        if (i == str1.length) {
            return;
        }
        str2[i] = str1[i];
        i++;
        recursiveCopy(str1, str2, i);
    }

    public static void main(String[] args) {
        char str1[] = "apple".toCharArray();
        char str2[] = new char[str1.length];
        char str3[] = "banana".toCharArray();
        char str4[] = new char[str3.length];
        iterativeCopy(str1, str2);
        recursiveCopy(str3, str4, 0);
        for (char e : str2) {
            System.out.print(e);
        }
        System.out.println("");
        for (char e : str4) {
            System.out.print(e);
        }
    }
}
