import java.util.Arrays;

public class AnagramChecker {
    
    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        // Test cases
        String[][] testCases = {
            {"listen", "silent"},
            {"hello", "world"},
            {"", ""},
            {"A gentleman", "Elegant man"},
            {"debit card", "bad credit"},
            {"funeral", "real fun"},
            {"restful", "fluster"}
        };

        for (String[] test : testCases) {
            boolean result = areAnagrams(test[0], test[1]);
            System.out.printf("\"%s\" and \"%s\" are %sanagrams%n", 
                test[0], test[1], result ? "" : "not ");
        }
    }
} 