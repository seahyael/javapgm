package src.Quiz;
public class ListArrayObject {
    private Object[] object;
    private int size;

    public ListArrayObject() {
        this.object = new Object[100];
        this.size = 0;
    }

    public void add(Object newo) {
        object[size] = newo;
        size++;
    }

    public Object get(int num) {
        return object[num];
    }

    public void remove(int i) {
        for (int j = i; j < size-1; j++) {
            object[j] = object[j + 1];
        }
        size--;
    }

    public void remove() {
        if (size > 0) {
            size--;
        }
    }

    public int size() {
        return size;
    }
}


