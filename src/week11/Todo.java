package src.week11;

public class Todo {
    private String title;
    private String description;
    private String dueDate;
    private String category;

    public Todo(String t, String d, String du, String c) {
        title = t;
        description = d;
        dueDate = du;
        category = c;
    }
    y
    public Todo(String t) {
        title = t;
        description = "";
        dueDate = "";
        category = "";
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getCategory() {
        return category;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setDescription(String d) {
        description = d;
    }

    public void setDueDate(String du) {
        dueDate = du;
    }

    public void setCategory(String c) {
        category = c;
    }

    public String toString() {
        String output = "";
        output += "Title: " + title + ", Description: " + description + ", Due Date: " + dueDate + ", Category: " + category;
        return output;
    }
}
