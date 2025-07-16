package work_with_arrays.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 7, 8, 4, 5 ,2, 6};

        for (int i = 0; i < arr1.length; i++) {
            int small = i;
            for (int j = i; j < arr1.length; j++) {
                if (arr1[j] < arr1[small]) small = j;
            }
            int temp = arr1[i];
            arr1[i] = arr1[small];
            arr1[small] = temp;
        }

    }
}
