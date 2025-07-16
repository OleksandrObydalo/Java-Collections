package work_with_arrays.sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 7, 8, 4, 5 ,2, 6};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }


    }
}
