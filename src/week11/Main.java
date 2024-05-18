package src.week11;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Main Pstudio = new Main();
        Pstudio.J062();
    }
    public void J061(){
        int menu, quit=0;
        Scanner s = new Scanner(System.in);
        WordCRUD manager = new WordCRUD();
        while(true){
            System.out.println("Menu> 1 Add 2 Edit 3 List 4 Delete 0 Exit");
            menu = s.nextInt();
            switch(menu){
                case 1: manager.addWord(); break;
                case 2: manager.editWord(); break;
                case 3: manager.listWord(); break;
                case 4: manager.deleteWord(); break;
                default: quit = 1;
            }
            if(quit == 1) break;
        }
    }

    void J062(){
        int input;
        boolean quit = false;
        Scanner in = new Scanner(System.in);
        BookCRUD b = new BookCRUD();

        while (!quit) {
            System.out.println("Menu : 1 Add 2 Edit 3 List 4 Delete 0 Exit");
            input = in.nextInt();
            in.nextLine();
            switch (input) {
                case 1:
                    b.addBook();
                    break;
                case 2:
                    b.editBook();
                    break;
                case 3:
                    b.listBooks();
                    break;
                case 4:
                    b.deleteBook();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong number!");
            }
        }
    }

    void J063(){
        int input;
        boolean quit = false;
        Scanner in = new Scanner(System.in);
        TodoCRUD t = new TodoCRUD();

        while (!quit) {
            System.out.println("Menu : 1 Add 2 Edit 3 List 4 Delete 0 Exit");
            input = in.nextInt();
            in.nextLine(); // consume newline
            switch (input) {
                case 1:
                    t.addTodo();
                    break;
                case 2:
                    t.editTodo();
                    break;
                case 3:
                    t.listTodos();
                    break;
                case 4:
                    t.deleteTodo();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong number!");
            }
        }
    }
}