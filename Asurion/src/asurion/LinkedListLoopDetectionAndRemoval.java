package asurion;



public class LinkedListLoopDetectionAndRemoval {
	Node head;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			LinkedListLoopDetectionAndRemoval list = new LinkedListLoopDetectionAndRemoval();
	        list.head = new Node(50);
	        list.head.next = new Node(20);
	        list.head.next.next = new Node(15);
	        list.head.next.next.next = new Node(4);
	        list.head.next.next.next.next = new Node(10);
	        list.printList(list.head);
	        // Creating a loop for testing 
	        list.head.next.next.next.next.next = list.head.next.next;
	        list.detectAndRemoveLoop(list.head);
	        System.out.println("Linked List after removing loop : ");
	        list.printList(list.head);
	    }
		
		

	
	public void detectAndRemoveLoop(Node node)
	{
		Node slow=node,fast=node;
		
		//loop detection
		while(fast!=null && fast.next!=null)
		{
			if(slow==fast)break;
			slow=slow.next;
			fast=fast.next.next;
		}
		
		//loop removal
		
		if(slow==fast)
		{
			slow=node;
			while(fast.next!=slow)
			{
				slow=slow.next;
				fast=fast.next;
			}
			
			fast.next=null;
		}
	}
	
	public void printList(Node node)
	{
		Node current=node;
		
		while(current!=null){
		System.out.print(current.data+" ");
		current=current.next;
		}
	}
	

}
