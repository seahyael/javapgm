package src.week11;

import java.util.ArrayList;
import java.util.Scanner;

public class BookCRUD {
    private ArrayList<Book> bookList;

    public BookCRUD() {
        bookList = new ArrayList<>();
    }

    public void addBook() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input title: ");
        String title = in.nextLine();
        System.out.print("Input author: ");
        String author = in.nextLine();
        System.out.print("Input category: ");
        String category = in.nextLine();
        System.out.print("Input price: ");
        double price = in.nextDouble();
        System.out.print("Input year: ");
        int year = in.nextInt();
        Book newBook = new Book(title, author, category, price, year);
        bookList.add(newBook);
    }

    public void editBook() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input title: ");
        String title = in.nextLine();
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.print("Input new author: ");
                book.setAuthor(in.nextLine());
                System.out.print("Input new category: ");
                book.setCategory(in.nextLine());
                System.out.print("Input new price: ");
                book.setPrice(in.nextDouble());
                System.out.print("Input new year: ");
                book.setYear(in.nextInt());
                return;
            }
        }
        System.out.println("No book.");
    }
    public void listBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No book.");
            return;
        }
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println((i + 1) + ". " + bookList.get(i).toString());
        }
    }

    public void deleteBook() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input title : ");
        String title = in.nextLine();
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                bookList.remove(book);
                return;
            }
        }
        System.out.println("No book.");
    }
}
