package work_with_arrays.sorting;

import java.util.Arrays;

public class SortingWithArraysClass {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 8, 3, 7, 2, 6, 4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int index = Arrays.binarySearch(numbers, 7);
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        Arrays.fill(numbers, 0);

    }
}
