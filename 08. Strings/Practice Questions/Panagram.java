class Panagram {
    // A pangram is a sentence containing every letter in the English Alphabet.
    // Example: The quick brown fox jumps over the lazy dog

    static boolean checkPanagram(String str){
        // Create a frequency Array of size 26
        boolean freq[] = new boolean[26];
        // Iterate over the string
        for(int i=0; i<str.length(); i++){
            // Lowercase the string and then get the ith character
            char currentChar = str.toLowerCase().charAt(i);
            // Check whether the character belongs to {a to z} to ignore space, special symbols.
            if (currentChar >= 'a' && currentChar <= 'z'){
                // Set the value of char to true in freq array
                freq[currentChar - 'a'] = true;
            }
        }
        // Iterate over the frequency array
        for(int i=0; i<freq.length; i++){
            // If any value is false return false
            if(freq[i] == false)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String sentence1 = "The quick brown fox jumps over the lazy dog";
        String sentence2 = "The brown fox jumps over the lazy dog";
        System.out.println(checkPanagram(sentence1));
        System.out.println(checkPanagram(sentence2));
    }    
}
