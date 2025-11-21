package maratona.java;

public class DevJava08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 30;
        dias[0][2] = 29;

        dias[1][0] = 28;
        dias[1][1] = 27;
        dias[1][2] = 26;

        dias[2][0] = 25;
        dias[2][1] = 24;
        dias[2][2] = 23;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("---------------------------");
        for (int[] arrBase: dias) {
            for (int num: arrBase) {
                System.out.println(num);
            }
        }
    }
}
