public class Student {
    String name;
    int[] marks;
    double percentage;

    public Student(String name, int... marks) {
        this.name = name;
        this.marks = marks;
    }

    public int totalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculatePercentance() {
        double total = totalMarks();
        double percentance = total / marks.length;
        return percentance;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Total " + totalMarks());
        System.out.println("Percentance " + calculatePercentance());
    }

    public static void main(String[] args) {
        Student s1 = new Student("Georgios", 15, 6, 4, 5);
        s1.displayDetails();

    }
}

