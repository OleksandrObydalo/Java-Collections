package work_with_arrays;

public class ArrayIterating {
    public static void main(String[] args) {
        double[] temperature = {20.3, 21.5, 18.7, 23.1, 19.8};
        for (double v : temperature) {
            System.out.println(v);
        }

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + ", ");
            }
            System.out.println();
        }


    }
}
