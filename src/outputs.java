public class outputs {
    public static void main(String[] args) {
        System.out.println("Line 1:" + (5==5)+(10==10*2));
        System.out.println("Line 1:" + 10 + 4 * 2 / 8+(10.5f==10.5));
        System.out.println("Line 1:" + (10.5f==10.5)+(10.5f==10.5f));
        String a = new String("Hello");
        String b = new String("Hello");
        System.out.println("Line 1:" + (a==b)+(a.equals(b)));
    }
}