public class Task5 {
    public static boolean isPalindrome(String text) {
        String text1 =text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String text2 = new StringBuilder(text1).reverse().toString();
        boolean a = text1.equals(text2);
        return a; // your implementation here
    }
    public static void main(String[] args) {
        /**
         * Checks if given <code>text</code> is a palindrome.
         *
         * @param text any string
         * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
         */
        System.out.println(isPalindrome("Madam, I'm Adam!"));

    }
}
