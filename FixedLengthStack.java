class FixedLengthStack implements Stack {
    private int[] stackArray;
    private int top;
    private int capacity;
    
    public FixedLengthStack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new int[capacity];
        this.top = -1;
    }

    @Override
    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow: Cannot push element, stack is full.");
            return;
        }
        stackArray[++top] = element;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow: Cannot pop element, stack is empty.");
            return -1;
        }
        return stackArray[top--];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
}