// program to concat two singly LL
class Node {
	int data;
	Node next;

	// Constructor
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LLC {

	public static Node insertAtTail(Node head1, Node tail1, int data) {
		Node temp = new Node(data);
		tail1.next = temp;
		tail1 = temp;
		return tail1;
	}

	public static void print(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void concat(Node head1, Node head2, Node tail1) {
		tail1.next = head2;
	}

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node head1 = node1;
		Node tail1 = node1;

		tail1 = insertAtTail(head1, tail1, 2);
		tail1 = insertAtTail(head1, tail1, 3);
		tail1 = insertAtTail(head1, tail1, 4);
		tail1 = insertAtTail(head1, tail1, 5);

		System.out.println("First Linked List: ");
		print(head1);

		Node node2 = new Node(6);
		Node head2 = node2;
		Node tail2 = node2;

		tail2 = insertAtTail(head2, tail2, 7);
		tail2 = insertAtTail(head2, tail2, 8);
		tail2 = insertAtTail(head2, tail2, 9);
		tail2 = insertAtTail(head2, tail2, 10);

		System.out.println("Second Linked List: ");
		print(head2);

		concat(head1, head2, tail1);

		System.out.println(
				"First Linked List after concatenation: ");
		print(head1);
	}
}