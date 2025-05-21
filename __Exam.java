interface Stack{
    void push(int elem);
    int pop();
    boolean isEmpty();
    void display();
}

class FixedLengthStack implements Stack{
    private int[] stack;
    private int top;
    private int capacity;
    public FixedLengthStack(int c){
        stack = new int[10];
        top = -1;
        capacity = c;
    }
    @Override
    public void push (int elem){
        if (top==capacity-1){
            System.out.println("Stack Overflow.");
        }
        stack[++top] = elem;
    }
    @Override
    public int pop(){
        if (top==-1){
            System.out.println("Stack Underflow.");
            return -1;
        }
        return stack[top--];
    }
    @Override
    public boolean isEmpty(){
        return top==-1;
    }
    @Override
    public void display(){
        System.out.print("\nStack:\n");
        for (int i=0; i<=top; i++){
            System.out.println(stack[i]);
        }
    }
}

class DynamicLengthStack implements Stack{
    private int[] stack;
    private int top;
    public DynamicLengthStack(){
        stack = new int[2];
        top = -1;
    }
    @Override
    public void push (int elem){
        if (top==stack.length-1){
            int newCapacity = stack.length*2;
            int[] newStack = new int[newCapacity];
            System.arraycopy(stack,0,newStack,0,stack.length);
            stack = newStack;
        }
        stack[++top] = elem;
    }
    @Override
    public int pop(){
        if (top==-1){
            System.out.println("Stack Underflow.");
            return -1;
        }
        return stack[top--];
    }
    @Override
    public boolean isEmpty(){
        return top==-1;
    }
    @Override
    public void display(){
        System.out.print("\nStack:\n");
        for (int i=0; i<=top; i++){
            System.out.println(stack[i]);
        }
    }
}

public class __Exam {
    public static void stackOps(Stack stack){
        stack.push(10);
        stack.display();
        stack.push(20);
        stack.display();
        stack.push(30);
        stack.display();
        System.out.println("\nPopped Element: "+stack.pop());
        stack.display();
        System.out.println("\nStack is empty? "+stack.isEmpty());
    }
    public static void main(String[] args) {
        Stack Fixed = new FixedLengthStack(5);
        System.out.println("Fixed Length Stack:");
        stackOps(Fixed);
        Stack Dynamic = new DynamicLengthStack();
        System.out.println("\nDynamic Length Stack:");
        stackOps(Dynamic);
    }
}

/*
Output:

Fixed Length Stack:

Stack:
10

Stack:
10
20

Stack:
10
20
30

Popped Element: 30

Stack:
10
20

Stack is empty? false

Dynamic Length Stack:

Stack:
10

Stack:
10
20

Stack:
10
20
30

Popped Element: 30

Stack:
10
20

Stack is empty? false
 */