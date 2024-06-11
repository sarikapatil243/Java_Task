public class Q1_1_ReverseString {
    public static void main(String[] args) {
        String input = "Hello World";
        String rev = reverseString(input);
        System.out.println(rev); // Output: 'dlroW olleH'
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}