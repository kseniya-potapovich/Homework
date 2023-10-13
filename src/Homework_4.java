import java.util.Arrays;
import java.util.Scanner;

public class Homework_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Прямой вывод массива");
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println("\nОбратный вывод массива");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        Arrays.sort(array);
        System.out.println("\nМинимальный элемент = " + array[0]);
        System.out.println("Максимальный элемент = " + array[size-1]);
        System.out.println(Arrays.toString(array));

    }
}
