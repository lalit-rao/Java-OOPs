import java.util.StringTokenizer;

public class StringsQues {
    public static void main(String[] args) {
        String s = "Ram$Kumar$Sharma";
        StringTokenizer st = new StringTokenizer(s, "$");
        StringBuilder result = new StringBuilder();
        int wordCount = 0;

        while (st.hasMoreTokens()) {
            String token = st.nextToken();

            if (wordCount < 2) {
                // For the first two words, append the first letter
                result.append(token.charAt(0));
            } else {
                // For the third word, append it as it is
                result.append(token);
            }

            if (st.hasMoreTokens()) {
                result.append(" "); // Add a space between tokens
            }

            wordCount++;
        }

        System.out.println(result.toString());
    }
}
