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
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] += n;
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
    }
}
