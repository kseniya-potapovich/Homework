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
        int[] sortArray = new int[size];
        for (int i = 0; i < size; i++) {
            sortArray[i] = array[i];
        }
        Arrays.sort(sortArray);
        System.out.println("\nМинимальный элемент = " + sortArray[0]);
        System.out.println("Максимальный элемент = " + sortArray[size - 1]);
        for (int i = 0; i < size; i++) {
            if (array[i] == sortArray[0]) {
                System.out.println("Индекс минимального элемента = " + i);
            }
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == sortArray[size - 1]) {
                System.out.println("Индекс максимального элемента = " + i);
            }
        }
        int nullItems = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                nullItems++;
            }
        }
        if (nullItems != 0) {
            System.out.println("Количество нулевых элементов = " + nullItems);
        } else {
            System.out.println("Нулевых элементов нет!");
        }
    }
}
