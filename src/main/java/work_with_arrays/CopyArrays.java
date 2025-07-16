package work_with_arrays;

public class CopyArrays {
    public static void main(String[] args) {
        String[] copyFrom = {"Affogato", "Americano", "Cappuccino"};
        String[] copyTo = new String[2];
        System.arraycopy(copyFrom, 1, copyTo, 0, 2);
        for(String s: copyTo){
            System.out.println(s);
        }

    }
}
