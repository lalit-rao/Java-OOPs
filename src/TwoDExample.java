public class TwoDExample {
    public static void main(String[] args) {
        int[][] multi = new int[5][10];
        int[][] multi1 = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        int[][] mult2 = new int[5][];
        for (int i = 0; i < 5; i++) {
            mult2[i] = new int[10];
        }
        int[][] multi3 = new int[5][];
        multi3[0] = new int[10];
        multi3[1] = new int[10];
        multi3[2] = new int[10];
        multi3[3] = new int[10];
        multi3[4] = new int[10];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                multi[i][j] = i * j;
                multi1[i][j] = i * j;
                mult2[i][j] = i * j;
                multi3[i][j] = i * j;
            }
        }
        System.out.println(multi1);
    }
}
