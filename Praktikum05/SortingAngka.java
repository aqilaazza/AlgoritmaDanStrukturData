package Praktikum05;

public class SortingAngka {
    public static int[] bubbleSort(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j =  0; j < n - i - 1; j++) { 
                if (numbers[j] > numbers[j + 1]) { //mengatur dari kecil ke besar
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        } 
        return numbers;
    }

    public static int [] selectionSort(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j =  i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIndex]) { //mengatur dari kecil kebesar
                    minIndex = j;
                }
            }

            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
        return numbers;
    }

    public static int [] insertionSort (int[] numbers) {
        int n = numbers.length; 

        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) { //mengatur dari kecil ke besar
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }

            numbers [j + 1] = key;
        }

        return numbers;
    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n"); 
    }
}

