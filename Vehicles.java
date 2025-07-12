class Vehicles {
    protected String brand;

    void startEngine() {
        System.out.println("Engine, Powering Up");
    }
}

class Drived extends Vehicles {
    String model;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

