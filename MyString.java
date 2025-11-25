public class MyString {
    public static void main(String[] args) {
        // System.out.println("Testing lowercase:");
        // System.out.println("UnHappy : " + lowerCase("UnHappy"));
        // System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15
        // Sheksls"));
        // System.out.println("TLV : " + lowerCase("TLV"));
        // System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                int tempChar = str.charAt(i) + 32;
                newStr += (char) tempChar;
            } else {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        int j = 0;

        if (str2.length() > str1.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (j == str2.length()) {
                return true;
            }
            if (i == str1.length() - 1 && j == str2.length() - 1) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    return true;
                }
            }
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            } else {
                j = 0;
            }
        }
        return false;
    }
}