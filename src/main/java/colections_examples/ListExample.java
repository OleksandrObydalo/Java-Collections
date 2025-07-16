package colections_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.remove(1);
        System.out.println(names.contains("Bob"));

        //Iterating List of Car instances
        List<Car> carList = new ArrayList<>();
        Iterator<Car> carIterator = carList.iterator();
        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            System.out.println(car.getModel());
        }

        //Array to List
        String[] sArr = {"one", "two", "three", "four"};
        List<String> sList = Arrays.asList(sArr);
        sList.set(3, "six");

        //List to Array
        List<Integer> iList = new ArrayList<>();
        Integer[] iArr = iList.toArray(new Integer[0]);




    }
}
