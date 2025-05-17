class StackOperations {
    public static void main(String[] args) {
        Stack fixedStack = new FixedLengthStack(5);
        System.out.println("Fixed Length Stack Operations:");
        performStackOperations(fixedStack);
        Stack dynamicStack = new DynamicLengthStack();
        System.out.println("\nDynamic Length Stack Operations:");
        performStackOperations(dynamicStack);
    }

    public static void performStackOperations(Stack stack) {
        System.out.println("Stack Size: " + stack.size());
        stack.push(10);
        System.out.println("Stack Size: " + stack.size());
        stack.push(20);
        System.out.println("Stack Size: " + stack.size());
        stack.push(30);
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}

/*
Output:

Fixed Length Stack Operations:
Stack Size: 0
Stack Size: 1
Stack Size: 2
Stack Size: 3
Pop: 30
Stack Size: 2
Pop: 20
Stack Size: 1
Is Empty: false
Stack Size: 1
Pop: 10
Stack Size: 0
Is Empty: true

Dynamic Length Stack Operations:
Stack Size: 0
Stack Size: 1
Stack Size: 2
Stack Size: 3
Pop: 30
Stack Size: 2
Pop: 20
Stack Size: 1
Is Empty: false
Stack Size: 1
Pop: 10
Stack Size: 0
Is Empty: true
*/