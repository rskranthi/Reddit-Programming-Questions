package asurion;

public class StackUsingLinkedList {

	Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public class LinkedListEmptyException extends RuntimeException
	{

		public LinkedListEmptyException(String message)
		{
			super(message);
		}
	}
	
	public class StackEmptyException extends RuntimeException
	{

		public StackEmptyException(String message)
		{
			super(message);
		}
	}
	
	public void push(int data)
	{
		Node node = new Node(data);
		
		node.next=head;
		head = node;
		
	}
	
	public int pop()
	{
		if(head==null)throw new StackEmptyException("Stack Empty");
		else
		{
			Node tempNode = head;
			head=head.next;
			return tempNode.data;
		}
		
	}
	
	public static void main(String args[])
	{
		StackUsingLinkedList linkedList = new StackUsingLinkedList();
		linkedList.head = new Node(5);
		linkedList.push(10);
		linkedList.push(15);
		linkedList.push(25);
		System.out.println(linkedList.pop());
		System.out.println(linkedList.pop());
		
		
	}
}
