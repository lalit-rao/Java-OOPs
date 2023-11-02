import java.util.*;

public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb.length());
        System.out.println(sb);

        for (int i = sb.length() - 1; i >= 0; i--) {
            System.out.println(sb.charAt(i));
        }

        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);

    }

/*        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        sb.insert(0, 'S');
        System.out.println(sb);
        sb.insert(2, 'n');
        System.out.println(sb);

        //delete the extra n
        sb.delete(2,4);
        System.out.println(sb);*/
}

