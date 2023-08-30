// Java program to implement stack using Deque
class stack{

// Class for a node of deque
static class DQueNode
{
	int value;
	DQueNode next;
	DQueNode prev;
}

// Implementation of deque class
static class deque
{
	
	// Pointers to head and tail of deque
	private DQueNode head;
	private DQueNode tail;

	// Constructor
	public deque()
	{
		head = tail = null;
	}
	
	// If list is empty
	boolean isEmpty(){
		if (head == null)
			return true;
			
		return false;
	}

	// count the number of nodes in list
	int size()
	{
		// If list is not empty
		if (!isEmpty())
		{
			DQueNode temp = head;
			int len = 0;
			
			while (temp != null)
			{
				len++;
				temp = temp.next;
			}
			return len;
		}
		return 0;
	}

	// Insert at last position of deque
	void insert_last(int element)
	{
		
		// Allocating node of DQueNode type
		DQueNode temp = new DQueNode();
		temp.value = element;

		// If element is the first element
		if (head == null)
		{
			head = tail = temp;
			temp.next = temp.prev = null;
		}
		else
		{
			tail.next = temp;
			temp.next = null;
			temp.prev = tail;
			tail = temp;
		}
	}

	// Remove element at the last position
	void remove_last()
	{
		
		// If list is not empty
		if (!isEmpty())
		{
			DQueNode temp = tail;
			tail = tail.prev;
			if(tail!=null)
			{
				tail.next = null;
			}
			return;
		}
		System.out.print("List is Empty");
	}

	// Displays the elements in deque
	void display()
	{
		
		// If list is not empty
		if (!isEmpty())
		{
			DQueNode temp = head;
			
			while (temp != null)
			{
				System.out.print(temp.value + " ");
				temp = temp.next;
			}

			return;
		}
		System.out.print("List is Empty");
	}
}

// Class to implement stack using Deque
static class Stack
{
	deque d = new deque();

	// push to push element at top of stack
	// using insert at last function of deque
	public void push(int element)
	{
		d.insert_last(element);
	}

	// Returns size
	public int size()
	{
		return d.size();
	}
	
	// pop to remove element at top of stack
	// using remove at last function of deque
	public void pop()
	{
		d.remove_last();
	}

	// Display
	public void display()
	{
		d.display();
	}
}

public static void main(String[] args)
{
	
	// Object of Stack
	Stack stk = new Stack();

	// push 7 and 8 at top of stack
	stk.push(7);
	stk.push(8);
	System.out.print("Stack: ");
	stk.display();

	// For new line
	System.out.println();
	
	// pop an element
	stk.pop();
	System.out.print("Stack: ");
	stk.display();

	// For new line
	System.out.println();
    System.out.println("Size of stack is " +stk.size());
}
}