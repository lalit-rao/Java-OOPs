import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int a = 1; a <= 2 * i - 1; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
