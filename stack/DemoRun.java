package stack;
import java.util.*;

public class DemoRun {
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		ArrayStack<Integer> st=new ArrayStack<>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		System.out.println("Popped Element: "+st.pop());
		
		System.out.println("Peek Element: "+st.peek());
		
		System.out.println("Stack Empty: "+st.isEmpty());
		
	}

}

