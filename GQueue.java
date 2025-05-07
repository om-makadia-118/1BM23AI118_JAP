import java.util.Arrays;

public class GQueue<T> {
    private T[] que;
    private int size;

    public GQueue() {
        que = (T[]) new Object[2];
        size = 0;
    }

    public void enqueue(T element) {
        if (size == que.length) {
            int newCapacity = que.length * 2;
            que = Arrays.copyOf(que, newCapacity);
        }
        que[size++] = element;
    }

    public T dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return null; // or throw new NoSuchElementException("Queue is empty");
        }
        T del_element = que[0];
        System.arraycopy(que, 1, que, 0, size - 1);
        que[--size] = null;
        return del_element;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(que[i]);
        }
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        // Create a GrowableQueue of integers
        GQueue<Integer> integerQueue = new GQueue<>();

        // Enqueue elements
        integerQueue.enqueue(10);
        integerQueue.enqueue(20);
        integerQueue.enqueue(30);

        System.out.println("Elements in the queue are:");
        integerQueue.display();

        // Dequeue an element
        Integer dequeuedElement = integerQueue.dequeue();
        System.out.println("Dequeued element: " + dequeuedElement);

        // Display size of the queue
        System.out.println("Queue size: " + integerQueue.getSize());
    }
}

/*
Output:

Elements in the queue are:
10
20
30
Dequeued element: 10
Queue size: 2
 */