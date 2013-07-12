public class Stack {
    private int size = 0;

    public Boolean isEmpty() {
        return size == 0;
    }

    public Integer getSize() {
        return size;
    }

    public void push(int element) {
        size++;
    }
}
