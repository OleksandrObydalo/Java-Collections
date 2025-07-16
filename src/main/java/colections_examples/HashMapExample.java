package colections_examples;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Alice", 95);
        System.out.println(grades.get("Alice"));
        grades.remove("Charlie");

    }
}
