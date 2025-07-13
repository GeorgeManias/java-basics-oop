class Vehicles {
    String brand;

    void startEngine() {
        System.out.println("Engine, Powering Up");
    }
}

class Drived extends Vehicles {
    String model;

    void displayInfo() {
        System.out.println("Brand " + brand);
        System.out.println("Model " + model);
    }
}


public class Main {
    public static void main(String[] args) {
        LibraryItem l1 = new LibraryItem("Test", "Georgios", 1997);
        Book b1= new Book("Test1", "Georgios1", 1998, 112);
        DVD d1 = new DVD("Test2", "Georgios2", 1999, 100.5);

       l1.displayInfo();
       b1.displayInfo();
       d1.displayInfo();
    }
}


/*
create a base class vehicles with fields brand and method startEngine() and Create a Drived class car that adds a
        field model and a Method display info(). Apply inheitance by creating an object of car and calling both
vehicle and Car Methods

 */