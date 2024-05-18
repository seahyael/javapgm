package src.week11;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoCRUD {
    private ArrayList<Todo> todoList;

    public TodoCRUD() {
        todoList = new ArrayList<>();
    }

    public void addTodo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input title: ");
        String title = in.nextLine();
        System.out.print("Input description: ");
        String description = in.nextLine();
        System.out.print("Input due date: ");
        String dueDate = in.nextLine();
        System.out.print("Input category: ");
        String category = in.nextLine();
        Todo newTodo = new Todo(title, description, dueDate, category);
        todoList.add(newTodo);
    }

    public void editTodo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input todo: ");
        String title = in.nextLine();
        for (Todo todo : todoList) {
            if (todo.getTitle().equalsIgnoreCase(title)) {
                System.out.print("Input new description: ");
                todo.setDescription(in.nextLine());
                System.out.print("Input new due date: ");
                todo.setDueDate(in.nextLine());
                System.out.print("Input new category: ");
                todo.setCategory(in.nextLine());
                return;
            }
        }
        System.out.println("No todo.");
    }

    public void listTodos() {
        if (todoList.isEmpty()) {
            System.out.println("No todo.");
            return;
        }
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println((i + 1) + ". " + todoList.get(i).toString());
        }
    }

    // Delete a todo
    public void deleteTodo() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input todo: ");
        String title = in.nextLine();
        for (Todo todo : todoList) {
            if (todo.getTitle().equalsIgnoreCase(title)) {
                todoList.remove(todo);
                return;
            }
        }
        System.out.println("No todo.");
    }
}
