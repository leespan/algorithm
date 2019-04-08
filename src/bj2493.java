import java.util.Scanner;
import java.util.Stack;

public class bj2493 {
	public static void main(String args[])
	{
		Scanner stdin= new Scanner(System.in);
		int N= stdin.nextInt();
		Stack<Integer> stack= new Stack<>();
		Stack<Integer> stack1=new Stack<>();
		for(int i=1; i<=N; i++)
		{
			int a= stdin.nextInt();
			for(;;) 
			{
				if(stack.empty()) {
					System.out.print("0 ");
					stack1.pop();
					break;
				}
				else if(stack.peek()>a)
				{
					System.out.print(stack1.peek()+" ");
					break;
				}
				else 
				{
					stack.pop();
					stack1.pop();
				}
			}	
			stack.push(a);
			stack1.push(i);
		}
	}
}

