package basicjavaprograms;

public class Practice {

    public static void main(String[] args) {

        // input string
        String str = "ASSAabloy";
        String str2 = "";

        // Check if the string is null or empty
        if (str == null || str.length() == 0) {
            System.out.println("Empty or null string is passed");
        } else {
            // Convert uppercase to lowercase and vice versa
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isUpperCase(ch)) {
                    str2 += Character.toLowerCase(ch);
                } else if (Character.isLowerCase(ch)) {
                    str2 += Character.toUpperCase(ch);
                }
            }
            // Output the result
            System.out.println(str2);  // Expected output: bloy
        }
    }
}
