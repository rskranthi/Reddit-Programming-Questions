package asurion;

import asurion.StackUsingLinkedList.Node;

public class QueueUsingLinkedList {
	
	Node head,tail;
	
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
	
	public void enQueue(int data)
	{
		Node node = new Node(data);
		
		if(tail==null)
		{
			tail=node;
			head=node;
			return;
		}
		
		tail.next=node;
		tail=node;
	}

	public Node deQueue() throws NullPointerException
	{
		if(head==null)return null;
		
		Node temp=head;
		head=head.next;
		
		if(head==null)tail=null;
		
		return temp;
		
		
	}
	
	public static void main(String args[])
	{
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.head = new Node(5);
		queue.enQueue(10);
		queue.enQueue(15);
		queue.enQueue(25);
		System.out.println(queue.deQueue().data);
		System.out.println(queue.deQueue().data);
		System.out.println(queue.deQueue().data);
		System.out.println(queue.deQueue());
		
	}

}
