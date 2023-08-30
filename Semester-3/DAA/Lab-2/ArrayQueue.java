// Analysis of Operations:

// Enqueue: Adding an item to the queue has a time complexity of O(1).
// Dequeue: Removing an item from the queue also has a time complexity of O(1).
// Peek: Retrieving the front item without removing it has a time complexity of O(1).
// isEmpty and size: These operations are also O(1).
// isFull: This operation is O(1)


//consider array to be circular
//size: keeps track of how many items are currently in the queue.
public class ArrayQueue<T> {
    private Object[] array;
    private int front;
    private int rear;
    private int size;
    
    public ArrayQueue(int capacity) {
        array = new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == array.length;
    }
    
    public int size() {
        return size;
    }
    
    public void enqueue(T item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % array.length;
        array[rear] = item;
        size++;
    }
    
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        T item = (T) array[front];
        front = (front + 1) % array.length;
        size--;
        return item;
    }
    
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return null;
        }
        return (T) array[front];
    }
    
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>(5);
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
}
