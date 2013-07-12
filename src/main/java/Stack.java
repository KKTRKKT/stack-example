public class Stack {
    private int size = 0;
    private int capacity;
    private int element;

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public Integer getSize() {
        return size;
    }

    public void push(int element) {
        if(size == capacity)
            throw new Overflow();
        this.element = element;
        size++;
    }

    public int pop() {
        if(size == 0)
            throw new Underflow();
        size--;
        return element;
    }

    public static Stack make(int capacity) {
        if(capacity < 0)
            throw new IllegalCapacity();
        return new Stack(capacity);
    }

    public class Overflow extends RuntimeException {
    }

    public static class IllegalCapacity extends RuntimeException {
    }

    public class Underflow extends RuntimeException {
    }
}
