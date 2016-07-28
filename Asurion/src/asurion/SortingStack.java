package asurion;

import java.util.Stack;

public class SortingStack {
	
	public static void main(String args[])
	{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(new Integer(-3));
		stack.push(new Integer(14));
		stack.push(new Integer(18));
		stack.push(new Integer(-5));
		stack.push(new Integer(30));
		
		
		
		
		//SortingStack sort=new SortingStack();
		stackSort(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		
	}

	public static void stackSort(Stack<Integer> stack)
	{
		if(!stack.isEmpty())
		{
			Integer temp = stack.pop();
			stackSort(stack);
			sortedInsert(stack,temp);
		}
		
		
		
	}
	
	public static void sortedInsert(Stack<Integer> stack,Integer data)
	{
		if(stack.isEmpty()|| data>=stack.peek())
		{
			stack.push(data);
			return;
		}
		
		else
		{
			Integer temp = stack.pop();
			sortedInsert(stack,data);
			stack.push(temp);
		}
	}
}
