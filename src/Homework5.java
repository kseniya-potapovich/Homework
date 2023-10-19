import java.util.Random;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        /** Task 1 */
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(-10, 10);
            }
        }
        /*for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/
        System.out.println("Введите число");
        int k = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] += k;
                sum += array[i][j];
            }
        }
        System.out.println("sum = " + sum);
        /** Task 2 */
        System.out.println("Шахматная доска");
        String[][] stringArray = new String[8][8];
        String b = "B";
        String w = "W";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    stringArray[i][j] = w;
                } else stringArray[i][j] = b;
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(stringArray[i][j] + " ");
            }
            System.out.println();
        }
        /** Task with * */
        int n = scanner.nextInt();//строки
        int m = scanner.nextInt();//столбцы
        int[][] A = new int[n][m];
        int count = 0;
        //int row=0;
        int col = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (; col < m; col++) {
                    A[i][col] = count;
                    count++;
                }
            } else {
                for (; col > 0; col--) {
                    A[i][col - 1] = count;
                    count++;
                }
            }
        }

        for (int r = 0; r < n; r++) {
            for (int e = 0; e < m; e++) {
                System.out.print(A[r][e] + "\t");
            }
            System.out.println();
        }
    }
}
