public class Main {

    // Main method
    public static void main(String[] args) {
        // Vehicle test
        Drived d1 = new Drived();
        d1.brand = "Audi";
        d1.model = "RS7";
        d1.startEngine();
        d1.displayInfo();

        // Area tests
        System.out.println("Area of square (5): " + area(5));
        System.out.println("Area of circle (3.0): " + area(3.0));

        // Sum of even numbers
        System.out.println("Sum of even numbers: " + sumOfEven(1, 2, 3, 4, 5, 6));
    }

    // Square area
    public static int area(int side) {
        return side * side;
    }

    // Circle area
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Sum of even numbers
    public static int sumOfEven(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}

