package basicjavaprograms;


/*
If you want to remove only the trailing 'a' characters from the string, you need to 
stop removing characters as soon as you encounter a non-'a' character 
from the end of the string.*/


public class TrimLastCharactersInString {

	
	
	
    public static void main(String[] args) {
        System.out.println(removeTrailingA("cataa"));  // Expected output: "cat"
        System.out.println(removeTrailingA("aabcda")); // Expected output: "aabcda"
        System.out.println(removeTrailingA("aab"));    // Expected output: "aab"
    }

    // Method to remove trailing 'a' characters
    public static String removeTrailingA(String str) {
        if (str == null) {
            return null;
        }
        int endIndex = str.length() - 1;
        while (endIndex >= 0 && str.charAt(endIndex) == 'a') {
            endIndex--;
        }
        return str.substring(0, endIndex + 1);
    }
}
