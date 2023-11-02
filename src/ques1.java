public class ques1 {
    public static void main(String[] args) {
        int a = 10, b = 20;

        if (a > 5 | b++ > 22) {
            System.out.println(b);
        }

        a = 10; // Resetting 'a' and 'b'
        b = 20;

        if (a > 5 || b++ > 22) {
            System.out.println(b);
        }
    }
}

