import java.util.Stack;

import java.util.EmptyStackException;

public class StackTest
{
	public static void main(String[]args)
	{
		Stack<Number> stack = new Stack<>();
		
		stack.push(12L);
		System.out.println("Pushed 12L");
		printStack(stack);
		
		stack.push(34567);
		System.out.println("Pushed 34567");
		printStack(stack);
		
		stack.push(1.0f);
		System.out.println("Pushed 1.0f");
		printStack(stack);
		
		stack.push(1234.5678);
		System.out.println("Pushed 1234.5678");
		printStack(stack);
		
		try
		{
			Number removedObject = null;
			
			while (true)
			{
				removedObject = stack.pop();
				
				System.out.printf("Popped %s%n", removedObject);
				
				printStack(stack);
			}
		}
		catch (EmptyStackException emptyStackException)
		{
			emptyStackException.printStackTrace();
		}
	}
	
	private static void printStack(Stack<Number> stack)
	{
		if(stack.isEmpty())
			System.out.printf("stack is empty%n%n");
		else
			System.out.printf("stack contains: %s (top)%n", stack);
	}
}