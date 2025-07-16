package work_with_arrays.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr2 = new int[]{1, 7, 8, 4, 5 ,2, 6};

        for (int a = 1; a < arr2.length; a++) {
            int keyValue = arr2[a];
            int b = a - 1;
            while (b >= 0 && arr2[b] > keyValue) {
                arr2[b + 1] = arr2[b];
                b--;
            }
            arr2[b + 1] = keyValue;
        }

    }
}
