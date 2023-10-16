import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();
        int[] arr = new int[rnd.nextInt(100000)];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = rnd.nextInt();
        }

        long a1 = System.currentTimeMillis();
        bubbleSort(arr);
        long b1 = System.currentTimeMillis();
        System.out.println("\nCzas bubblesorta: ");
        System.out.println(b1 - a1 + " ms");

        long a2 = System.currentTimeMillis();
        insertionSort(arr);
        long b2 = System.currentTimeMillis();
        System.out.println("\nCzas insertionsorta: ");
        System.out.println(b2 - a2 + " ms");

        long a3 = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long b3 = System.currentTimeMillis();
        System.out.println("\nCzas quicksorta: ");
        System.out.println(b3 - a3 + " ms");

    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void bubbleSort(int[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < inputArray.length - i - 1; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
        }

    }

    private static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int currentValue = inputArray[i];
            int j = i - 1;
            while (j >= 0 && inputArray[j] > currentValue) {
                inputArray[j + 1] = inputArray[j];
                j = j - 1;
            }
            inputArray[j + 1] = currentValue;
        }

    }

    private static void quickSort(int[] array, int a, int b) {
        if (a >= b) {
            return;
        }
        int pivot = array[b];
        int lewy = a;
        int prawy = b;
        while (lewy < prawy) {
            while (array[lewy] <= pivot && lewy < prawy) {
                lewy++;
            }
            while (array[prawy] >= pivot && lewy < prawy) {
                prawy--;
            }
            swap(array, lewy, prawy);
        }
        swap(array, lewy, b);
        quickSort(array, a, lewy - 1);
        quickSort(array, lewy + 1, b);
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void mergeSort(int[] inputArray) {

    }



}

