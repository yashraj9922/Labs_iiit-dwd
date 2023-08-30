// Java program to implement queue using Deque
class queue {

	// Class for a node of deque
	static class DQueNode {
		int value;
		DQueNode next;
		DQueNode prev;
	}

	// Implementation of deque class
	static class deque {

		// Pointers to head and tail of deque
		private DQueNode head;
		private DQueNode tail;

		// Constructor
		public deque() {
			head = tail = null;
		}

		// If list is empty
		boolean isEmpty() {
			if (head == null)
				return true;

			return false;
		}

		// count the number of nodes in list
		int size() {
			// If list is not empty
			if (!isEmpty()) {
				DQueNode temp = head;
				int len = 0;

				while (temp != null) {
					len++;
					temp = temp.next;
				}
				return len;
			}
			return 0;
		}

		// Insert at last position of deque
		void insert_last(int element) {

			// Allocating node of DQueNode type
			DQueNode temp = new DQueNode();
			temp.value = element;

			// If element is the first element
			if (head == null) {
				head = tail = temp;
				temp.next = temp.prev = null;
			} else {
				tail.next = temp;
				temp.next = null;
				temp.prev = tail;
				tail = temp;
			}
		}

		// Remove element at the first position
		void remove_first() {

			// If list is not empty
			if (!isEmpty()) {
				DQueNode temp = head;
				head = head.next;
				head.prev = null;

				return;
			}
			System.out.print("List is Empty");
		}

		// Displays the elements in deque
		void display() {

			// If list is not empty
			if (!isEmpty()) {
				DQueNode temp = head;

				while (temp != null) {
					System.out.print(temp.value + " ");
					temp = temp.next;
				}

				return;
			}
			System.out.print("List is Empty");
		}
	}

	// Class to implement queue using deque
	static class Queue {
		deque d = new deque();

		// enqueue to insert element at last
		// using insert at last function of deque
		public void enqueue(int element) {
			d.insert_last(element);
		}

		// dequeue to remove element from first
		// using remove at first function of deque
		public void dequeue() {
			d.remove_first();
		}

		// display
		public void display() {
			d.display();
		}

		// size
		public int size() {
			return d.size();
		}
	}

	public static void main(String[] args) {
		// Object of Queue
		Queue que = new Queue();

		// Insert 12 and 13 in queue
		que.enqueue(12);
		que.enqueue(13);
		System.out.print("Queue: ");
		que.display();

		// New line
		System.out.println();

		// Delete an element from queue
		que.dequeue();
		System.out.print("Queue: ");
		que.display();

		// New line
		System.out.println();
		System.out.println("Size of queue is " +
				que.size());
	}
}
