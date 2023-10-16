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
        /*int[] arraySec = new int[size];
        for (int i = 0; i < size; i++) {
            arraySec[i] = scanner.nextInt();
        }*/
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
        int k;
        for (int i = 0; i < size / 2; i++) {
            k = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = k;
        }
        System.out.println("Задача 5:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        int r = 0;
        for (int i = 1; i < size; i++) {
            if (array[i] <= array[i - 1]) {
                r = 1;
                break;
            }
        }
        if (r == 0) {
            System.out.println("\nМассив является возрастающей последовательностью");
        } else {
            System.out.println("\nМассив не является возрастающей последовательностью");
        }

        /** Task with *
         * Имеется массив из неотрицательных чисел(любой). Представьте что массив
         * представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
         * добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
         * содержит нуля в начале, кроме самого числа 0*/
        System.out.println("Task with *:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) (Math.random()*10);
        }
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        String str = "";

        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }
        int d = Integer.parseInt(str) + 1;
        if (arr[0] == 0){
            size++;
        }
        int[] arr1 = new int[size];
        for (int i = arr1.length - 1; i >= 0; i--) {
            arr1[i] = d % 10;
            d = d / 10;
        }
        System.out.println("Преобразованный массив: " + Arrays.toString(arr1));
    }
}
