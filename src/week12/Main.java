package src.week12;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        src.week12.Main pstudio = new src.week12.Main();
        pstudio.J071();
    }
    public void displayHelp(){
        System.out.println("Usage of commands\n" +
                "1. Add a new item ( add )\n" +
                "2. Delete an existing item ( del )\n" +
                "3. Update an item ( edit )\n" +
                "4. List all items ( ls )\n" +
                "5. sort the list by name ( ls name )\n" +
                "6. sort the list by name descending ( ls name desc )\n" +
                "7. sort the list by date ( ls date )\n" +
                "8. sort the list by date descending ( ls date desc )\n" +
                "9. show commands guidelines ( ? )\n" +
                "10. quit program ( exit )\n");
    }
    public void J071() {
        Scanner sc = new Scanner(System.in);
        TodoCRUD manager = new TodoCRUD();
        boolean quit = false;
        do {
            System.out.print("> ");
            String line = sc.nextLine();
            String choice = line.split(" ")[0];
            switch (choice) {
                case "add":
                    manager.addItem();
                    break;
                case "del":
                    manager.deleteItem();
                    break;
                case "edit":
                    manager.updateItem();
                    break;
                case "ls":
                    if (line.contains("name"))
                        manager.sortByName();
                    if (line.contains("date"))
                        manager.sortByDate();
                    if (line.contains("desc"))
                        manager.reverseList();
                    manager.printAll();
                    break;
                case "?":
                    displayHelp();
                    break;
                case "exit":
                    quit = true;
                    break;
                default:
                    System.out.println("? for help.");
                    break;
            }
        } while (!quit);
    }
}