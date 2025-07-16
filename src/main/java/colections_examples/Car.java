package colections_examples;

class Car implements Comparable<Car> {
    private String model;
    public Car(String model) { this.model = model; }
    public String getModel() { return model; }
    @Override
    public int compareTo(Car other) {
        return this.model.compareTo(other.model);
    }
}

