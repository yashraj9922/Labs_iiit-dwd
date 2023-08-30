// Analysis of Operations:

// Enqueue: Adding an item to the rear of the doubly linked list has a time complexity of O(1).
// Dequeue: Removing an item from the front of the doubly linked list also has a time complexity of O(1).
// Peek: Retrieving the front item without removing it is also O(1).
// isEmpty and size: These operations are O(1)


class DoublyNode<T> {
    T data;
    DoublyNode<T> prev;
    DoublyNode<T> next;

    public DoublyNode(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedListQueue<T> {
    private DoublyNode<T> front;
    private DoublyNode<T> rear;
    private int size;

    public DoublyLinkedListQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(T item) {
        DoublyNode<T> newNode = new DoublyNode<>(item);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        T item = front.data;
        front = front.next;
        if (front != null) {
            front.prev = null;
        } else {
            rear = null;
        }
        size--;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return null;
        }
        return front.data;
    }

    public static void main(String[] args) {
        DoublyLinkedListQueue<Integer> queue = new DoublyLinkedListQueue<>();

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
