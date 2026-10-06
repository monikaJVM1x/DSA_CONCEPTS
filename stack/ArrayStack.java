package stack;

public class ArrayStack <T>{
	
	static final int MAX_SIZE=20;
	T arr[]=(T[]) new Object[MAX_SIZE];
	
	int top;
	
	ArrayStack()
	{
		top=-1;
	}
	
	void push(T val)
	{
		if(top==MAX_SIZE-1)
		{
			throw new IndexOutOfBoundsException("Stack is overflow");
		}
		arr[++top]=val;
	}
	
	T pop()
	{
		if(top==-1)
		{
			throw new IndexOutOfBoundsException("Stack is underflow");
		}
		return arr[top--];
	}
	
	T peek()
	{
		return arr[top];
	}
	
	boolean isEmpty()
	{
		return top==-1;
	}
	

}
