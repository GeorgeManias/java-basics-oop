public class Circle{
    double radius;
    double area;

    public Circle(double radius) {
        this.radius= radius;
        this.area=Math.PI* radius;
    }

    public static Circle createCircle(double radius){
        return new Circle(radius);
    }

    public static void main(String[] args) {
        Circle c= new Circle(100);
        System.out.println(c.area);
    }





}
