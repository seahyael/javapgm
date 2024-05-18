package src.week11;

public class Book {
    private String title;
    private String author;
    private String category;
    private double price;
    private int year;

    public Book(String t, String a, String c, double p, int y) {
        title = t;
        author = a;
        category = c;
        price = p;
        year = y;
    }

    public Book(String t) {
        title = t;
        author = " ";
        category = " ";
        price = 0;
        year = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setCategory(String c) {
        category = c;
    }

    public void setPrice(double p) {
        price = p;
    }

    public void setYear(int y) {
        year = y;
    }

    public String toString() {
        String output = "";
        output += "Title: " + title + ", Author: " + author + ", Category: " + category + ", Price: $" + price + ", Year: " + year;
        return output;
    }
}
