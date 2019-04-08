import java.util.Scanner;

public class sw2805 {
	public static void main(String args[])
	{
		Scanner stdin = new Scanner(System.in);
		int[] a[]= new int[49][49];
		
		int Testcase = stdin.nextInt();
		
		for(int t= 0; t<Testcase; t++)
		{
			int N= stdin.nextInt();
			int K= N/2;
			int sum=0;
			for(int n = 0; n<N; n++)
			{
			String worth = stdin.next();
			for(int i=0; i<worth.length();i++)
				{
					a[n][i]=worth.charAt(i)-'0';//charAt은 String의 i번째를 char형으로
					if(n<=K && i>=(K-n) && i<=(K+n))
					{
							sum=sum+a[n][i];
					}
					else if(n>K &&i>=(n-K) && i<=((3*K)-n))
					{
						sum=sum+a[n][i];
					}
				}
			}
			System.out.println("#"+(t+1)+" " + sum);
		}
	}
}
