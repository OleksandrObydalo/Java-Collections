package colections_examples;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.remove("Cherry");
        System.out.println(fruits.size());

    }
}
