public class FactorChecker {
    public static void main(String[] args) {
        int n = 12; // The integer n
        int[] arr = {2, 3, 4, 6}; // Array of integers to check

        boolean areFactors = Factors(n, arr);

        if (areFactors) {
            System.out.println("All elements in the array are factors of " + n);
        } else {
            System.out.println("Not all elements in the array are factors of " + n);
        }
    }

    public static boolean Factors(int n, int[] arr) {
        for (int factor : arr) {
            if (n % factor != 0) {
                return false; // If any element is not a factor, return false
            }
        }
        return true; // If the loop completes without returning false, all are factors
    }
}
