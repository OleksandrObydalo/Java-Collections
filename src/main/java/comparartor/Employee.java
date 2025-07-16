package comparartor;

public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Alex", 100000);
        Employee employee2 = new Employee("John", 300000);
        NameComparator comparator = new NameComparator();

        System.out.println(comparator.compare(employee1, employee2));
    }
}
