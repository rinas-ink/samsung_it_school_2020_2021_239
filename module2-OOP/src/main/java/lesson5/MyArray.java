package lesson5;

public class MyArray<T extends Number> {

    private Object[] data;
    private int size, capacity;

    public MyArray() {
        size = 0;
        capacity = 100;
    }

    public void add(T value) {
        data[size++] = value;
    }

    public void remove() {
        size--;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) data[index];
    }
}
