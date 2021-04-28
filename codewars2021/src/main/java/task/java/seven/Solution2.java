package task.java.seven;

class Solution2 {
    static int stray(int[] numbers) {
        var element = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            element = element ^ numbers[i];
        }
        return element;
    }

    private static void quickSort(int[] numbers, int low, int high) {
        int i = low;
        int j = high;
        int pivot = numbers[low + (high - low) / 2];

        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }
            while (numbers[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(numbers, i, j);
                i++;
                j--;
            }

            if (low < j) {
                quickSort(numbers, low, j);
            }
            if (i < high) {
                quickSort(numbers, i, high);
            }
        }
    }

    private static void exchange(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;

    }
}
