package asurion;

import java.util.Stack;

import asurion.StackUsingLinkedList.Node;
import asurion.StackUsingLinkedList.StackEmptyException;

public class StackGetMinOrderOfOne {
Node head;
static StackUsingLinkedList minLinkedList;

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
		
		if(minLinkedList.head!=null && minLinkedList.head.data<=data)
		{
			minLinkedList.push(minLinkedList.head.data);
		}
		else
			minLinkedList.push(data);
		
	}
	
	public int pop()
	{
		if(head==null)throw new StackEmptyException("Stack Empty");
		else
		{
			Node tempNode = head;
			head=head.next;
			
			minLinkedList.pop();
			return tempNode.data;
		}
		
	}
	
	public int getMin()
	{
		if(minLinkedList.head!=null)
		return minLinkedList.head.data;
		else return -1;
	}
	public static void main(String args[])
	{
		StackGetMinOrderOfOne linkedList = new StackGetMinOrderOfOne();
		minLinkedList = new StackUsingLinkedList();
		System.out.println("min: "+linkedList.getMin());
		linkedList.push(10);
		System.out.println("min: "+linkedList.getMin());
		linkedList.push(15);
		System.out.println("min: "+linkedList.getMin());
		linkedList.push(25);
		System.out.println("min: "+linkedList.getMin());
		System.out.println(linkedList.pop());
		System.out.println("min: "+linkedList.getMin());
		System.out.println(linkedList.pop());
		System.out.println("min: "+linkedList.getMin());
		
		
		
	}

}
