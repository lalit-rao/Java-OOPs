import java.util.Arrays;

public class SortStringAlphabetically {
    public static void main(String[] args) {
        String input = "STRING";

        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println("Original string: " + input);
        System.out.println("Sorted string: " + sortedString);
    }
}
