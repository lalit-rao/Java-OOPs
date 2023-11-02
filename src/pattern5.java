import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                int EN = 2 * j;
                System.out.print(EN + " ");
            }

            System.out.println();
        }


        scanner.close();
    }
}
