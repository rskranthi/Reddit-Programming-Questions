package asurion;

import java.util.Stack;

public class ReverseOfAStack {

	public static void main(String args[])
	{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(new Integer(-3));
		stack.push(new Integer(14));
		stack.push(new Integer(18));
		stack.push(new Integer(-5));
		stack.push(new Integer(30));
		
		//Reversing a stack
		reverseStack(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}
	
	public static void reverseStack(Stack<Integer> stack)
	{
		if(!stack.isEmpty())
		{
			Integer temp = stack.pop();
			reverseStack(stack);
			insertAtBottom(stack,temp);
		}
	}
	
	public static void insertAtBottom(Stack<Integer> stack, Integer data)
	{
		if(stack.isEmpty())
		{
			stack.push(data);
		}
		else
		{
			Integer temp = stack.pop();
			insertAtBottom(stack,data);
			stack.push(temp);
		}
	}
	
}
