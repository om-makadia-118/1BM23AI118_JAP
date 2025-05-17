class DynamicLengthStack implements Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    public DynamicLengthStack() {
        this.capacity = 10;
        this.stackArray = new int[capacity];
        this.top = -1;
    }

    @Override
    public void push(int element) {
        if (top == capacity - 1) {
            capacity *= 2;
            int[] newStackArray = new int[capacity];
            System.arraycopy(stackArray, 0, newStackArray, 0, stackArray.length);
            stackArray = newStackArray;
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