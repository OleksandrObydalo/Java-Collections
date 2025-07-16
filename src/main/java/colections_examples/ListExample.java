package colections_examples;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.remove(1);
        System.out.println(names.contains("Bob"));

    }
}
