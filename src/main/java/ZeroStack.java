class ZeroStack implements Stack {
    public Boolean isEmpty() {
        return true;
    }

    public Integer getSize() {
        return 0;
    }

    public void push(int element) {
        throw new BoundedStack.Overflow();
    }

    public int pop() {
        throw new BoundedStack.Underflow();
    }
}
