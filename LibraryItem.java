//Main Class
class LibraryItem {
    private String title;
    private String author;
    private int year;

    //main Class Constructor
    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    //main Getters + Setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo(){
        System.out.println(getTitle());
        System.out.println(getAuthor());
        System.out.println(getYear());
    }
}


class Book extends LibraryItem {
    private int page;

    public int getPages() {
        return page;
    }

    public void setPages(int page) {
        this.page = page;
    }

    public Book(String title, String author, int year, int page) {
        super(title, author, year);
        this.page = page;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(getPages());
    }
}

class DVD extends LibraryItem {
    private double duration;

    public DVD(String title, String author, int year, double duration) {
        super(title, author, year);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(getDuration());
    }
}




/*
🔹 Exercise 1: Library System
Concepts: Encapsulation, Inheritance

Description:
Create a base class LibraryItem with private fields:

title, author, year

Provide:

Getters and setters for each field.

Create subclasses:

Book (add int pages)

DVD (add double duration)

In the main class:

Create one Book and one DVD

Use setters to assign values, and print all details using getters.

 */
