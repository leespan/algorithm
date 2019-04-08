import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class bj7785 {
	public static void main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		int n= stdin.nextInt();
		Set<String> set= new HashSet<>();
		for(int i=0;i<n;i++)
		{
			String a = stdin.next();
			String b = stdin.next();
			if(b.equals("enter"))
			{
				set.add(a);
			}
			else if(b.equals("leave"))
			{
				set.remove(a);
			}
		}
		ArrayList<String> al= new ArrayList<>(set);
		Collections.sort(al);
		ListIterator iter= al.listIterator(al.size());
		
		while(iter.hasPrevious()) {
			System.out.println(iter.previous());
		}
		
	}
}
